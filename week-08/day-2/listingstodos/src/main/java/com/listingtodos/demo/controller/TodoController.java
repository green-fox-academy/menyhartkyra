package com.listingtodos.demo.controller;

import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {
  private TaskRepository taskRepository;

  @Autowired
  public TodoController(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }


  @RequestMapping(path = {"/", "/list"})
  public String list(Model model, @RequestParam(required = false) String isActive) {
    if (isActive == null) {
      model.addAttribute("todos", taskRepository.findAll());
    } else if (isActive.equals("true")) {
      model.addAttribute("todos", taskRepository.findAllByDone(false));
    } else if (isActive.equals("false")) {
      model.addAttribute("todos", taskRepository.findAllByDone(true));
    }
    return "todolist";
  }


  @RequestMapping(value = "/add-new-task", method = RequestMethod.GET)
  public String renderNewTaskPage() {
    return "add-new-task";
  }

  @RequestMapping(value = "/add-new-task", method = RequestMethod.POST)
  public String addNewTask(String newTaskName, @RequestParam(required = false) boolean
      isTaskUrgent, @RequestParam(required = false) boolean isTaskDone) {

    taskRepository.save(new Todo(newTaskName, isTaskUrgent, isTaskDone));
    return "redirect:/";
  }

  @RequestMapping(value = "/remove", method = RequestMethod.POST)
  public String removeTask(long taskIndexToRemove) {
    taskRepository.deleteById(taskIndexToRemove);
    return "redirect:/";
  }

  @RequestMapping(path = "/find", method = RequestMethod.POST)
  public String findTask(String taskToFind, Model model){
    model.addAttribute("todos",taskRepository.findByTitleContaining(taskToFind));
    return "todolist";
  }
}
