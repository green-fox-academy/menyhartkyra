package com.listingtodos.demo.repository;

import com.listingtodos.demo.model.Todo;
import com.listingtodos.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
public User getUserByTodos(Todo todo);
}
