package com.listingtodos.demo;

import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class DemoApplication /*implements CommandLineRunner*/ {
  private TaskRepository taskRepository;

  @Autowired
  public DemoApplication(TaskRepository taskRepository) {
    this.taskRepository = taskRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

//  @Override
//  public void run(String... args) throws Exception {
//    taskRepository
//        .save(new Todo("I have to learn Object Relational Mapping", @RequestParam String username));
//    taskRepository.save(new Todo("I have to feed my kitty"));
//  }
}
