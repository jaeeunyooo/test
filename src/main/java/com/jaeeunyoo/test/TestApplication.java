package com.jaeeunyoo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        try {
            ApplicationContext ctx = SpringApplication.run(TestApplication.class, args);
            DispatcherServlet dispatcherServlet = (DispatcherServlet) ctx.getBean("dispatcherServlet");
            dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
            dispatcherServlet.setDispatchOptionsRequest(true);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
