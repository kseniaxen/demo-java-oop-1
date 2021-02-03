package org.tyaa.demo.console.oop.controller;

import org.tyaa.demo.console.oop.model.TodoItem;
import org.tyaa.demo.console.oop.repository.TodoItemRepository;

import java.util.List;

public abstract class AbstractTodoItemController {

    protected TodoItemRepository todoItemRepository;

    public AbstractTodoItemController(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    public abstract void create(TodoItem item);
    public abstract List<TodoItem> getAll();
}
