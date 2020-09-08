package com.greenfox.controller;

import com.greenfox.model.Task;
import com.greenfox.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  private TaskRepository taskRepository;

  @Autowired
  public MainController(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  @RequestMapping(value = "/todo", method = RequestMethod.GET)
  public String renderTodos(Model model){
    model.addAttribute("todos",taskRepository.getTodos());
    return "todo";
  }

  @RequestMapping(value = "/add-new-task", method = RequestMethod.GET)
  public String renderNewTaskPage(){
    return "add-new-task";
  }

  @RequestMapping(value = "/add-new-task", method = RequestMethod.POST)
  public String addNewTask(String newTaskName, @RequestParam(required = false) String isTaskUrgent){
    boolean urgent = false;
    if (isTaskUrgent == null){
    } else {
      urgent = true;
    }
    taskRepository.add(newTaskName, urgent);
    return "redirect:/todo";
  }

  @RequestMapping(value = "/remove", method = RequestMethod.POST)
  public String removeTask(int taskIndexToRemove){
    taskRepository.remove(taskIndexToRemove);
    return "redirect:/todo";
  }

  @RequestMapping(value = "/complete", method = RequestMethod.POST)
  public String completeTask(int taskIndexToComplete){
    taskRepository.complete(taskIndexToComplete);
    return "redirect:/todo";
  }
}
