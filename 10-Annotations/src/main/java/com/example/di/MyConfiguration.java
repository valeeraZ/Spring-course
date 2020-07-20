package com.example.di;

import com.example.scope.MyScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan(value = "com.example.di")
public class MyConfiguration {
    @Bean("stringList")
    public List<String> stringList(){
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        return list;
    }

    @Bean
    @Order(1)
    public String string1(){
        return "i am";
    }

    @Bean
    @Order(0)
    public String string2(){
        return "sylvain";
    }

    @Bean
    public Map<String, Integer> integerMap(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("b",2);
        return map;
    }

    @Bean("int1")
    public Integer integer1(){
        return 3;
    }

    @Bean
    public Integer integer2(){
        return 4;
    }
}

