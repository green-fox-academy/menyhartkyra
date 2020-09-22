package com.listingtodos.demo.service;

import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.model.User;
import com.listingtodos.demo.repository.TaskRepository;
import com.listingtodos.demo.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private TaskRepository taskRepository;
  private UserRepository userRepository;

  @Autowired
  public TodoService(TaskRepository taskRepository, UserRepository userRepository) {
    this.taskRepository = taskRepository;
    this.userRepository = userRepository;
  }

  public void deleteTodo(int taskIndexToRemove){
    Todo todo = findTodoById(taskIndexToRemove);
    User user = userRepository.getUserByTodos(todo);
    user.getTodos().remove(todo);
    taskRepository.deleteById(taskIndexToRemove);
    System.out.println();
  }

  public void addTodo(Todo todo){
    taskRepository.save(todo);
  }

  public List<Todo> getTodosByUser(String username){
    return taskRepository.findByUserName(username);
  }

  public List<Todo> findTodoByTitle(String todo){
    return taskRepository.findByTitleContaining(todo);
  }

  public Todo findTodoById(int id){
    return taskRepository.findById(id).orElse(null);
  }

  public void complete(int taskIndexToComplete, User user) {
    //user.getTodos().get(taskIndexToComplete).setDone(true);
    List<Todo> todos = taskRepository.findByUserName(user.getName());
    todos.stream().filter(todo -> todo.getId() == taskIndexToComplete).findFirst().orElse(null).setDone(true);

//        taskRepository.findByUserName(username).stream().filter(t -> t.getId() == taskIndexToComplete)
//        .findFirst().orElse(null);
//    todo.setDone(true);
  }
}
