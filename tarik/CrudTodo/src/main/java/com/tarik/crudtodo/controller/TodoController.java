package com.tarik.crudtodo.controller;

import com.tarik.crudtodo.model.TodoModel;
import com.tarik.crudtodo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String displayTodoList(Model model) {
        List<TodoModel> todoList = todoService.getTodoList();
        model.addAttribute("list", todoList);
        return "homePage";
    }

    @GetMapping("/add")
    public String displayAddForm(Model model) {
        model.addAttribute("todo", new TodoModel());
        return "addForm";
    }

    @PostMapping("/save")
    public String add(@ModelAttribute TodoModel todoModel) {
        todoService.addTodoToList(todoModel.getTitle(), todoModel.getContent());
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        todoService.deleteTodoById(id);
        return "redirect:/";
    }
}
