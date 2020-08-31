import models.Auto;
import models.User;
import services.UserService;
import ui.Menu;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        final var sc = new Scanner(System.in);
        final var us = new UserService();

//        new Menu("Simple user management system")
//                .add("List of all users", () -> us.findAllUsers().forEach(System.out::println))
//                .add("Find user by id", () -> System.out.println(us.findUser(sc.nextInt())))
//                .run();


        User user = us.findUser(2);
        System.out.println(user);
        System.out.println(user.getAutos());

//        User user = new User("Петя", 42);
//        us.saveUser(user);
//
//        Auto honda = new Auto("Honda Edix", "blue");
//        honda.setUser(user);
//        user.addAuto(honda);
//
//        Auto ford = new Auto("Audi", "silver");
//        ford.setUser(user);
//        user.addAuto(ford);
//        us.updateUser(user);
    }

    static void findUser() {

    }
}