package com.tarik.crudtodo.model;

public class TodoModel {

    private String title;
    private String content;

    public TodoModel(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public TodoModel() {

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

    public String toString() {
        return String.format("Title: %s\nContent: %s",title,content);
    }

}
