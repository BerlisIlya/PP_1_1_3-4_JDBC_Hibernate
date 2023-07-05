package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.type.StringRepresentableType;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        Util util = new Util();
        util.getConnection();
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        System.out.println("Table used is created");

        userService.saveUser("Ilya", "Berlis", (byte) 33);
        System.out.println("User whose name is Ilya added to DB");

        userService.saveUser("Arny", "Shwartzweasley", (byte) 12);
        System.out.println("User whose name is Ilya added to DB");

        userService.saveUser("Britney", "Spears", (byte) 80);
        System.out.println("User whose name is Ilya added to DB");

        userService.saveUser("Baraka", "Bamma", (byte) 5);
        System.out.println("User whose name is Ilya added to DB");

        List<User> users = userService.getAllUsers();
        System.out.println("List all users");

        for (User user : users) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();
        System.out.println("Table was cleaned");

        userService.dropUsersTable();
        System.out.println("Table dropped");
    }
}
