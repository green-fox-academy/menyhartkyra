package com.listingtodos.demo.repository;

import com.listingtodos.demo.model.Assignee;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Integer> {
  List<Assignee> findAll();
}
