package com.greenfox.repository;

import com.greenfox.model.Task;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {
  private List<Task> todos;

  public TaskRepository() {
    todos = new ArrayList<>();
  }

  public void add(String task, boolean urgent){
    Task newTask = new Task(task);
    newTask.setUrgent(urgent);
    todos.add(newTask);
  }

  public void remove(int index){
    todos.remove(index);
  }

  public void complete(int index){
    todos.get(index).setCompleted(true);
  }

  public List<Task> getTodos() {
    return todos;
  }

//  public Task getTaskFromName(String taskName){
//    return todos.stream().filter(t -> t.getName().equals(taskName)).findFirst().orElse(null);
//  }
}
