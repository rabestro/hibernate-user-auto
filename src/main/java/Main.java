import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = userService.findUser(2);
        System.out.println(user);
        System.out.println(user.getAutos());

//        User user = new User("Петя",42);
//        userService.saveUser(user);
//
//        Auto honda = new Auto("Honda Edix", "blue");
//        honda.setUser(user);
//        user.addAuto(honda);
//
//        Auto ford = new Auto("Audi", "silver");
//        ford.setUser(user);
//        user.addAuto(ford);
//        userService.updateUser(user);
    }
}