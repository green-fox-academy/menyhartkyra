package com.listingtodos.demo;

import com.listingtodos.demo.model.Assignee;
import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.model.User;
import com.listingtodos.demo.repository.TaskRepository;
import com.listingtodos.demo.service.AuthenticationService;
import com.listingtodos.demo.service.TodoService;
import javax.jws.soap.SOAPBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
  private TodoService todoService;
  private AuthenticationService authenticationService;

  @Autowired
  public DemoApplication(TodoService todoService,
                         AuthenticationService authenticationService) {
    this.todoService = todoService;
    this.authenticationService = authenticationService;
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args){
    Assignee zsolt = new Assignee("Zsolt","zsolt@email.hu");
    Assignee aniko = new Assignee("Aniko","aniko@email.hu");
    todoService.saveAssignee(zsolt); //cascadeALL-nál nem kell elmenteni előre az assignee-ket
    todoService.saveAssignee(aniko);
    User user = new User("Kyra","1234");
    authenticationService.addUser(user);
    Todo todo = new Todo("eat",user,false,false);
    Todo todo2 = new Todo("drink coffee",user,false,false);
    todo.setAssignee(zsolt);
    todo2.setAssignee(aniko);
    todoService.addTodo(todo);
    todoService.addTodo(todo2);
  }
}
