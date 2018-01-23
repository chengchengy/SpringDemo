package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifyCircleDemoApp {
    public static void main(String[] args) {
        // load string configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLiftCycle-applicationContext.xml");

        //retrieve bean from spring container
        Coach theCoath = context.getBean("myCoach", Coach.class);
        System.out.println(theCoath.getDailyWorkout());
        context.close();
    }
}
