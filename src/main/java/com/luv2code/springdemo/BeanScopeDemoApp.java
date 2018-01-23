package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load string configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoath = context.getBean("myCoach", Coach.class);
        Coach alphaCoath = context.getBean("myCoach", Coach.class);

        //same
        boolean result = (theCoath == alphaCoath);
        System.out.println("point to same object? : " + result);
        System.out.println("\nMemory location for theCoach: " + theCoath);
        System.out.println("\nMemory location for alphaCoath: " + alphaCoath);
    }
}
