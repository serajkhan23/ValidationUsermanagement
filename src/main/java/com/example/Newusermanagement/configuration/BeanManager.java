package com.example.Newusermanagement.configuration;

import com.example.Newusermanagement.model.Type;
import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



@Configuration
 class BeanManager {
    @Bean
    public List<User> getInitializedList()
    {
        User initUser =new User(0) ;
        List<User> initList = new ArrayList<>();

        initList.add(initUser);

        return initList;
    }
}
