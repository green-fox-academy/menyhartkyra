package com.listingtodos.demo.controller;

import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.repository.TaskRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
  private TaskRepository taskRepository;

  @Autowired
  public TodoController(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

//  @RequestMapping(path = "/todo")
//  public String renderMainPage(){
//    return "todolist";
//  }

  @RequestMapping(path = {"/", "/list"})
  public String list(Model model, @RequestParam(required = false) String isActive) {
    if (isActive == null) {
      model.addAttribute("todos", taskRepository.findAll());
    } else {
     List<Todo> tasks = new ArrayList<>();
     taskRepository.findAll().forEach(tasks::add);
     tasks = tasks.stream().filter(x -> !x.isDone()).collect(Collectors.toList());
      model.addAttribute("todos", tasks);
    }
    return "todolist";
  }


  @RequestMapping(value = "/add-new-task", method = RequestMethod.GET)
  public String renderNewTaskPage() {
    return "add-new-task";
  }

  @RequestMapping(value = "/add-new-task", method = RequestMethod.POST)
  public String addNewTask(String newTaskName, @RequestParam(required = false) String isTaskUrgent,
                           @RequestParam(required = false) String isTaskDone) {
    boolean urgent = isTaskUrgent != null;
    boolean done = isTaskDone != null;
    taskRepository.save(new Todo(newTaskName, urgent, done));
    return "redirect:/";
  }

  @RequestMapping(value = "/remove", method = RequestMethod.POST)
  public String removeTask(long taskIndexToRemove){
    taskRepository.deleteById(taskIndexToRemove);
    return "redirect:/";
  }
}
