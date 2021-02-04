package org.tyaa.demo.console.oop.model;

public class TodoItem {

    private static Integer lastId;

    private Integer id;
    private String title;

    static {
        lastId = 0;
    }

    public TodoItem() {
        this.id = ++lastId;
    }

    public TodoItem(Integer id, String title) {
        this.id = id;
        this.setTitle(title);
    }

    public TodoItem(String title) {
        this.id = ++lastId;
        this.setTitle(title);
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("id must be not blank");
        }
        this.title = title;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}