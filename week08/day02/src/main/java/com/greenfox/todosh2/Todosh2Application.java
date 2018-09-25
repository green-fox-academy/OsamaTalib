package com.greenfox.todosh2;

import com.greenfox.todosh2.modle.Todo;
import com.greenfox.todosh2.repository.RepositoryTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todosh2Application implements CommandLineRunner {
  private RepositoryTodo repositoryTodo;

  @Autowired
  public Todosh2Application(RepositoryTodo repositoryTodo) {
    this.repositoryTodo = repositoryTodo;
  }

  public static void main(String[] args) {
    SpringApplication.run(Todosh2Application.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
    repositoryTodo.save(new Todo("I have to learn Object Relational Mapping"));
    repositoryTodo.save(new Todo("I have to learn Object Relational Mapping"));
  }
}
