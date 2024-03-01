package com.tarik.crudtodo.controller;

import com.tarik.crudtodo.model.TodoModel;
import com.tarik.crudtodo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
        String title = todoModel.getTitle();
        String content = todoModel.getContent();
        todoService.addTodoToList(title,content);
        return "redirect:/";
    }

}
