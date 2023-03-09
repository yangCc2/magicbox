package com.yang.springboot;

import com.yang.springboot.entity.Animal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Description:
 * @Author: WY
 * @Date: 2023/3/9 14:36
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        //com.yang.springboot.entity.Animal
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        boolean user = run.containsBean("user");

        boolean botany = run.containsBean("botany");
        System.out.println("存在植物："+ botany);
        System.out.println("存在人类："+ user);

//        System.out.println(user);
//        System.out.println("============");
//        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
    }
}
