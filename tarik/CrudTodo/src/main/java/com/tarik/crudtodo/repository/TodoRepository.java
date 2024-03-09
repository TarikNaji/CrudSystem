package com.tarik.crudtodo.repository;

import com.tarik.crudtodo.model.TodoModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class TodoRepository {

    private final List<TodoModel> todoList;

    public TodoRepository() {
        this.todoList = new ArrayList<>();
        todoList.add(new TodoModel("Spise", "Mad"));
        todoList.add(new TodoModel("Drikke", "Vand"));
    }

    public List<TodoModel> getTodoList() {
        return todoList;
    }

    public void addTodoToList(String title, String content) {
        TodoModel todoModel = new TodoModel(title, content);
        todoList.add(todoModel);
    }

    public void deleteTodoById(int id) {
        todoList.removeIf(todo -> todo.getId() == id);
    }
}
