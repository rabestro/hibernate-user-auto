package ui;

import models.User;
import services.UserService;

import java.util.Scanner;

public class Application implements Runnable {
    final static Scanner sc = new Scanner(System.in);
    private final UserService service;

    public Application(UserService userService) {
        this.service = userService;

    }

    public void run() {
        new Menu("Simple user management system")
                .add("List of all users", () -> service.findAllUsers().forEach(System.out::println))
                .add("Find user by id", this::findUser)
                .add("Add new user", this::addUser)
                .add("Delete user", this::deleteUser)
                .run();
    }

    void addUser() {
        System.out.println("Enter user name:");
        var name = sc.nextLine();
        System.out.println("Enter user age:");
        var age = Integer.parseInt(sc.nextLine());
        service.saveUser(new User(name, age));
    }

    void deleteUser() {
        System.out.println("Enter user id:");
        var id = Integer.parseInt(sc.nextLine());
        service.deleteUser(service.findUser(id));
    }

    void findUser() {
        System.out.println("Enter user id:");
        var id = Integer.parseInt(sc.nextLine());
        var user = service.findUser(id);
        System.out.println(user);
    }
}
