package com.example.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class TestBean implements InitializingBean, DisposableBean {
    public TestBean(){
        System.out.println("TestBean init");
    }

    public void destroy() throws Exception {
        System.out.println("接口-执行destroy方法");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("接口-执行afterPropertiesSet方法");
    }

    public void initMethod() {
        System.out.println("自定义-执行init-method方法");
    }

    public void destroyMethod() {
        System.out.println("自定义-执行destroy-method方法");
    }

    @PostConstruct
    public void initMethodAnnotation() {
        System.out.println("注解-执行PostConstruct");
    }

    @PreDestroy
    public void destroyMethodAnnotation() {
        System.out.println("注解-执行PreDestroy");
    }
}
