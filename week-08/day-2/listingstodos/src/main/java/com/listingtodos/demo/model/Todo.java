package com.listingtodos.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
  private String title;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private boolean urgent;
  private boolean done;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    done = false;
    urgent = false;
  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.done = done;
    this.urgent = urgent;
  }

  //region getters setters
  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public long getId() {
    return id;
  }
  //endregion
}
