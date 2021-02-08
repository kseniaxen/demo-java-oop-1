package org.tyaa.demo.console.oop.model;

import javax.swing.text.StyledEditorKit;
import java.util.Date;

public class TodoItem {

    private static Integer lastId;

    private Integer id;
    private String title;
    private String description;
    private Date date;
    private Boolean done;

    static {
        lastId = 0;
    }

    public TodoItem() {
        this.id = ++lastId;
    }

    public TodoItem(Integer id, String title, String description, Date date, Boolean done) {
        this.id = id;
        this.setTitle(title);
        this.setDescription(description);
        this.setDate(date);
        this.setDone(done);
    }

    public TodoItem(String title, String description, Date date, Boolean done) {
        this.id = ++lastId;
        this.setTitle(title);
        this.setDescription(description);
        this.setDate(date);
        this.setDone(done);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", done='" + done + '\'' +
                '}';
    }
}