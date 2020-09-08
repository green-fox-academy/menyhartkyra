package com.greenfox.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Task {
  private boolean completed;
  private String name;
  private int id;
  private static AtomicInteger idCounter = new AtomicInteger();
  private boolean isUrgent;

  public Task(String name) {
    this.name = name;
    completed = false;
    id = idCounter.incrementAndGet();
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }


  public boolean isCompleted() {
    return completed;
  }

  public void setCompleted(boolean completed) {
    this.completed = completed;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }
}
