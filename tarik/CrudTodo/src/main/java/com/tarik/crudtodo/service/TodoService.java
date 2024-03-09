package com.tarik.crudtodo.service;

import com.tarik.crudtodo.model.TodoModel;
import com.tarik.crudtodo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoModel> getTodoList() {
        return todoRepository.getTodoList();
    }

    public void addTodoToList(String title, String content) {
        todoRepository.addTodoToList(title, content);
    }

    public void deleteTodoById(int id) {
        todoRepository.deleteTodoById(id);
    }
}
