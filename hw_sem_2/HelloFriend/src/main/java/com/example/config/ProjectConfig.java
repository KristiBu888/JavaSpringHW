package com.example.config;

import com.example.domain.Friend;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("Miyki")
    @Primary
    Friend Friend1()
    {
        Friend obFriend = new Friend();
        obFriend.setName("Miyki");
        obFriend.setSmile("=)");
        return obFriend;
    }

    @Bean("Lisa")
    Friend Friend2()
    {
        Friend obFriend = new Friend();
        obFriend.setName("Lisa");
        obFriend.setSmile("^_^");
        return obFriend;
    }

    @Bean
    String hello () {return "Hello";}

}
