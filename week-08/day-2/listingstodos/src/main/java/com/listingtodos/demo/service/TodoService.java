package com.listingtodos.demo.service;

import com.listingtodos.demo.model.Assignee;
import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.model.User;
import com.listingtodos.demo.repository.AssigneeRepository;
import com.listingtodos.demo.repository.TaskRepository;
import com.listingtodos.demo.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  private TaskRepository taskRepository;
  private UserRepository userRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public TodoService(TaskRepository taskRepository, UserRepository userRepository, AssigneeRepository assigneeRepository) {
    this.taskRepository = taskRepository;
    this.userRepository = userRepository;
    this.assigneeRepository = assigneeRepository;
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
    //user.getTodos().add(todo);
    System.out.println();
//    User user = userRepository.getUserByTodos(todo);
//    user.addTodo(todo);
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

  public List<Assignee> getAssignees(){
    return assigneeRepository.findAll();
  }

  public void saveAssignee(Assignee assignee){
    assigneeRepository.save(assignee);
  }
}
