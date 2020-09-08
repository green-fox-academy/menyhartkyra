package com.listingtodos.demo.repository;

import com.listingtodos.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Todo, Long> {

}
