package com.listingtodos.demo.controller;

import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.repository.TaskRepository;
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

  @RequestMapping(path = {"/", "/list"} )
  public String list(Model model){
    model.addAttribute("todos",taskRepository.findAll());
    return "todolist";
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
    taskRepository.save(new Todo(newTaskName));
    return "redirect:/todo";
  }
}
