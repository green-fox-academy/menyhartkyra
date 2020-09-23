package com.listingtodos.demo;

import com.listingtodos.demo.model.Assignee;
import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.repository.TaskRepository;
import com.listingtodos.demo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
  private TodoService todoService;

  public DemoApplication(TodoService todoService) {
    this.todoService = todoService;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args){
    Assignee zsolt = new Assignee("Zsolt","zsolt@email.hu");
    Assignee aniko = new Assignee("Aniko","aniko@email.hu");
    todoService.saveAssignee(zsolt);
    todoService.saveAssignee(aniko);
  }
}
