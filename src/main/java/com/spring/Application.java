package com.spring;

import com.spring.config.Appconfig;
import com.spring.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String [] ar) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        CustomerService service = context.getBean("customerService",CustomerService.class);
        service.get();

    }
}
