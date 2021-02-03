package org.tyaa.demo.console.oop.repository;

import org.tyaa.demo.console.oop.Main;
import org.tyaa.demo.console.oop.model.TodoItem;

import java.util.List;

public class FakeTodoItemRepository implements TodoItemRepository {
    @Override
    public void add(TodoItem item) {
        Main.todoItems.add(item);
    }
    @Override
    public List<TodoItem> getAll() {
        return Main.todoItems;
    }
}