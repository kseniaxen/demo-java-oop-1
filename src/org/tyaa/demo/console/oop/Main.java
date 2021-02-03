package org.tyaa.demo.console.oop;

import org.tyaa.demo.console.oop.controller.ConsoleTodoItemController;
import org.tyaa.demo.console.oop.model.TodoItem;
import org.tyaa.demo.console.oop.repository.FakeTodoItemRepository;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<TodoItem> todoItems = new ArrayList<>();

    public static void main(String[] args) {
	    /* for (String arg : args) {
            System.out.println(arg);
        } */
        // TodoItem todoItem1 = new TodoItem("Task1");
        ConsoleTodoItemController controller = new ConsoleTodoItemController(new FakeTodoItemRepository());
        ConsoleTodoItemController.UserDialog userDialog = controller.new UserDialog();
        userDialog.create();
        userDialog.printAll();
    }
}
