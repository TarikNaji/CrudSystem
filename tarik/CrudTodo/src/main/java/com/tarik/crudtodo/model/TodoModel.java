package com.tarik.crudtodo.model;

import java.util.Random;

public class TodoModel {

    private String title;
    private String content;
    private static int idCounter = 1;
    private int id;

    public TodoModel(String title, String content, int id) {
        this.title = title;
        this.content = content;
        this.id = idCounter++;
    }
    public TodoModel(int id) {
        this.id = idCounter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        TodoModel.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return String.format("Title: %s\nContent: %s",title,content);
    }

}
