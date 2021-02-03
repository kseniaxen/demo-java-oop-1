package org.tyaa.demo.console.oop.repository;

import org.tyaa.demo.console.oop.model.TodoItem;

import java.util.List;

public interface TodoItemRepository {
    void add(TodoItem item);
    List<TodoItem> getAll();
}
