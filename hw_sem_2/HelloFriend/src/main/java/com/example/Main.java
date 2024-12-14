package com.example;

// Это как библиотека классов. таким методом, который показан в этом примере уже не пользуются. Рассматриваем его только для понимания.

import com.example.config.ProjectConfig;
import com.example.domain.Friend;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Friend simpleFriend = context.getBean(Friend.class);
        String n = context.getBean(String.class);
        System.out.println(n+ " " +simpleFriend.getName()+ " " +simpleFriend.getSmile());
    }
}