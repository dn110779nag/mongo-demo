package com.example;

import com.example.dao.pojo.User;
import com.example.services.UserService;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example.config")
public class MongoDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(MongoDemoApplication.class, args);
        UserService userService = ctx.getBean(UserService.class);
        int id = 2;
        String fio = "Иванов Иван Иванович" + new Date();
        System.out.println("fio="+fio);
        User u1 = userService.insert(id, fio);
        System.out.println("u1=" + u1);

        User u2 = userService.get(id);
        System.out.println("u2=" + u2);
    }
}
