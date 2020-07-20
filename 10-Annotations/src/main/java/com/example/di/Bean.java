package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Bean {
    private AnotherBean anotherBean1;
    private AnotherBean anotherBean2;
    @Autowired
    private AnotherBean anotherBean3;

    private List<String> stringList;

    private Map<String, Integer> integerMap;

    private String string;

    private ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }

    @Autowired
    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public String getString() {
        return string;
    }
    @Value("hello")
    public void setString(String string) {
        this.string = string;
    }


    public Map<String, Integer> getIntegerMap() {
        return integerMap;
    }

    @Autowired
    public void setIntegerMap(Map<String, Integer> integerMap) {
        this.integerMap = integerMap;
    }

    @Autowired
    public Bean(AnotherBean anotherBean1) {
        this.anotherBean1 = anotherBean1;
    }

    public AnotherBean getAnotherBean1() {
        return anotherBean1;
    }

    public void setAnotherBean1(AnotherBean anotherBean1) {
        this.anotherBean1 = anotherBean1;
    }

    public AnotherBean getAnotherBean3() {
        return anotherBean3;
    }

    public void setAnotherBean3(AnotherBean anotherBean3) {
        this.anotherBean3 = anotherBean3;
    }

    public List<String> getStringList() {
        return stringList;
    }

    @Autowired
    @Qualifier("stringList")
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public AnotherBean getAnotherBean2() {
        return anotherBean2;
    }

    @Autowired
    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "anotherBean1=" + anotherBean1 +
                ", anotherBean2=" + anotherBean2 +
                ", anotherBean3=" + anotherBean3 +
                '}';
    }
}
