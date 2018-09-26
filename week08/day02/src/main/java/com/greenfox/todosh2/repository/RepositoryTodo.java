package com.greenfox.todosh2.repository;

import com.greenfox.todosh2.modle.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.validation.OverridesAttribute;
import java.util.List;

@Repository
public interface RepositoryTodo extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDoneFalse();

}
