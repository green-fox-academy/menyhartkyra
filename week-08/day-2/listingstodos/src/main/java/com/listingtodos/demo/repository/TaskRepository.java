package com.listingtodos.demo.repository;

import com.listingtodos.demo.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends CrudRepository<Todo, Long> {
public List<Todo> findAllByDone(boolean done);
public List<Todo> findByTitleContaining(String title);
}
