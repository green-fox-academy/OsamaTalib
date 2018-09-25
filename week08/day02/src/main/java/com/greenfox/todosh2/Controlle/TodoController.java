package com.greenfox.todosh2.Controlle;

import com.greenfox.todosh2.repository.RepositoryTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {
  RepositoryTodo repositoryTodo;

  @Autowired
  public TodoController(RepositoryTodo repositoryTodo) {
    this.repositoryTodo = repositoryTodo;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) String isDone) {
    if (isDone == null || isDone.equals("false")) {
      model.addAttribute("todos", repositoryTodo.findAll());
    } else {
      model.addAttribute("todos", repositoryTodo.findAllByDoneFalse());
    }
    return "todoslist";
  }
}
