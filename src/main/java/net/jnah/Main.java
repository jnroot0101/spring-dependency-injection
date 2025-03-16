package net.jnah;

import net.jnah.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.jnah");
        UserService userService = context.getBean(UserService.class);

        System.out.println("Result: " + userService.calculate());
    }
}