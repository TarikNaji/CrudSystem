package com.tarik.crudtodo.controller;

import com.tarik.crudtodo.model.TodoModel;
import com.tarik.crudtodo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

}
