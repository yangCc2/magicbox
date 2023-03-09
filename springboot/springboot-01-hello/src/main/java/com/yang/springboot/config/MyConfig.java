package com.yang.springboot.config;

import com.yang.springboot.entity.Animal;
import com.yang.springboot.entity.Botany;
import com.yang.springboot.entity.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: yang
 * @date: 2023/3/9 16:14
 * @desc:
 */
@Configuration
@Import(Animal.class)
//import 引入的组件默认id是全类名 com.yang.springboot.entity.Animal
public class MyConfig {

    @Bean
    public Botany botany(){
        return new Botany();
    }


    @ConditionalOnBean(Botany.class)
    @Bean
    public User user(){
        return new User();
    }





}
