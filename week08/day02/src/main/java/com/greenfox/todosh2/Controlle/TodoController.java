package com.greenfox.todosh2.Controlle;

import com.greenfox.todosh2.modle.Todo;
import com.greenfox.todosh2.repository.RepositoryTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
  RepositoryTodo repositoryTodo;

  @Autowired
  public TodoController(RepositoryTodo repositoryTodo) {
    this.repositoryTodo = repositoryTodo;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) String isDone) {
    if (isDone == null || isDone.equals("false")) {
      model.addAttribute("todo", repositoryTodo.findAll());
    } else {
      model.addAttribute("todo", repositoryTodo.findAllByDoneFalse());
    }
    return "todoslist";
  }

  @GetMapping("/add")
  public String toDoForm(Model model) {
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping("/add")
  public String toDoSubmit(@ModelAttribute Todo todo) {
    repositoryTodo.save(todo);
    return "redirect:/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable("id") Long id) {
    repositoryTodo.deleteById(id);
    return "redirect:/list";
  }

  @GetMapping("/{id}/update")
  public String editForm(@PathVariable("id") Long id ,Model model) {
    model.addAttribute("todo" ,repositoryTodo.findById(id).get());
    return "edit";
  }

  @PostMapping("/{id}/update")
  public String editSubmit(@ModelAttribute Todo todo) {
    repositoryTodo.save(todo);
    return "redirect:/list";
  }
}
