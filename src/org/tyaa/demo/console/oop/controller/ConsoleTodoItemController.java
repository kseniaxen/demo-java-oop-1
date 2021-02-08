package org.tyaa.demo.console.oop.controller;

import org.tyaa.demo.console.oop.model.TodoItem;
import org.tyaa.demo.console.oop.repository.TodoItemRepository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public final class ConsoleTodoItemController extends AbstractTodoItemController {

    private Scanner scanner;

    private static class Constants {
        public final static String PLACEHOLDER_SYMBOLS = "***";
    }

    public class UserDialog {

        public void create() {
            System.out.println("Input title then press Enter");
            String title = scanner.nextLine();
            System.out.println("Input description then press Enter");
            String description = scanner.nextLine();

            System.out.println("Input date then press Enter");
            String date = scanner.nextLine();
            DateFormat dateFormat=new SimpleDateFormat("dd.MM.yyyy");
            Date dateParse = null;
            try {
                dateParse = dateFormat.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            System.out.println("Input done then press Enter");
            String done = scanner.nextLine();
            Boolean doneParse = Boolean.parseBoolean(done);

            TodoItem item = new TodoItem(title,description,dateParse,doneParse);
            todoItemRepository.add(item);
            System.out.println(Constants.PLACEHOLDER_SYMBOLS);
        }

        public void printAll() {
            for (TodoItem item : todoItemRepository.getAll()) {
                System.out.println(item);
            }
            System.out.println(Constants.PLACEHOLDER_SYMBOLS);
        }
    }

    public ConsoleTodoItemController(TodoItemRepository todoItemRepository) {
        super(todoItemRepository);
        scanner = new Scanner(System.in);
    }

    @Override
    public void create(TodoItem item) {
        this.todoItemRepository.add(item);
    }

    @Override
    public List<TodoItem> getAll() {
        return this.todoItemRepository.getAll();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        scanner.close();
        System.out.println("ConsoleTodoItemController finalize");
    }
}
