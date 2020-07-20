package com.example.lifecycle;

import com.example.scope.MyScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.scope")
public class MyConfiguration {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public TestBean testBean(){
        return new TestBean();
    }
}
