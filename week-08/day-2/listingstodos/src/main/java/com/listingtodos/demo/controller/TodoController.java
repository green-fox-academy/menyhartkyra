package com.listingtodos.demo.controller;

import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.model.User;
import com.listingtodos.demo.repository.UserRepository;
import com.listingtodos.demo.service.AuthenticationService;
import com.listingtodos.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
  private AuthenticationService authenticationService;
  private TodoService todoService;
  private User user;

  @Autowired
  public TodoController(AuthenticationService authenticationService, TodoService todoService, UserRepository userRepository) {
    this.authenticationService = authenticationService;
    this.todoService = todoService;
  }

  @RequestMapping(path = "/list")
  public String list(Model model, @RequestParam(required = false) String isActive) {
    if (isActive == null) {
      model.addAttribute("username", user.getName());
      model.addAttribute("todos", todoService.getTodosByUser(user.getName()));
    } else if (isActive.equals("true")) {
      //model.addAttribute("todos", taskRepository.findAllByDone(false));
    } else if (isActive.equals("false")) {
      //model.addAttribute("todos", taskRepository.findAllByDone(true));
    }
    return "todolist";
  }

  @RequestMapping(value = "/add-new-task", method = RequestMethod.GET)
  public String renderNewTaskPage() {
    return "add-new-task";
  }

  @RequestMapping(value = "/add-new-task", method = RequestMethod.POST)
  public String addNewTask(String newTaskName,
                           @RequestParam(required = false) boolean isTaskUrgent,
                           @RequestParam(required = false) boolean isTaskDone) {
    todoService.addTodo(new Todo(newTaskName, user, isTaskUrgent, isTaskDone));
    return "redirect:/list?username=" + user.getName();
  }

  @RequestMapping(value = "/remove", method = RequestMethod.POST)
  public String removeTask(int taskIndexToRemove) {
    todoService.deleteTodo(taskIndexToRemove);
    return "redirect:/list?username=" + user.getName();
  }

  @RequestMapping(path = "/find", method = RequestMethod.POST)
  public String findTask(String taskToFind, Model model) {
    model.addAttribute("todos", todoService.findTodoByTitle(taskToFind));
    return "todolist";
  }

  @RequestMapping(path = {"/", "/login"}, method = RequestMethod.GET)
  public String renderLoginPage() {
    return "login";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String login(String username, String password) {
    if (!authenticationService.isUserInDatabase(username)){
      return "register";
    }
    if (authenticationService.authenticateUser(username, password)) {
      user = authenticationService.findUserByName(username);
      return "redirect:/list?username=" + username;
    } else {
      return "login";
    }
  }

  @RequestMapping(path = "/register", method = RequestMethod.GET)
  public String renderRegisterPage() {
    return "register";
  }

  @RequestMapping(path = "/register", method = RequestMethod.POST)
  public String register(String username, String password) {
    authenticationService.addUser(new User(username, password));
    return "login";
  }

  @RequestMapping(value = "/complete", method = RequestMethod.POST)
  public String completeTask(int taskIndexToComplete){
    Todo todo = todoService.findTodoById(taskIndexToComplete);
    todo.setDone(true);
    todoService.addTodo(todo);
    return "redirect:/list";
  }
}
