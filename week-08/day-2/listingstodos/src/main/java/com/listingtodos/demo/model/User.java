package com.listingtodos.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Fetch;

@Entity
public class User {
  @Id
  @Column(length = 12)
  private String name;
  private String password;
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Todo> todos;

  public User() {
    todos = new ArrayList<>();
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public User(String name, String password) {
    todos = new ArrayList<>();
    this.name = name;
    this.password = password;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void addTodo(Todo todo){
    todo.setUser(this);
    todos.add(todo);
  }
}
