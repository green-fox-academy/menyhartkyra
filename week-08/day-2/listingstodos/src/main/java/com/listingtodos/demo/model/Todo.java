package com.listingtodos.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
  private String title;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private boolean urgent;
  private boolean done;
  @ManyToOne(fetch = FetchType.EAGER)
  private User user;

  public Todo() {
  }

  public Todo(String title, User user) {
    this.title = title;
    this.user = user;
    done = false;
    urgent = false;
  }

  public Todo(String title, User user, boolean urgent, boolean done) {
    this.user = user;
    this.title = title;
    this.done = done;
    this.urgent = urgent;
  }

  //region getters setters

  public User getUser() {
    return user;
  }
  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }

  public int getId() {
    return id;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setUser(User user) {
    this.user = user;
  }

  //endregion
}
