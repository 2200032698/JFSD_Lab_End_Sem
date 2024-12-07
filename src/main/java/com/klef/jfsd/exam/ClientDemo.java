package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        // Load configuration using Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Retrieve and print the Employee bean
        Employee employee = context.getBean(Employee.class);
        System.out.println("Employee Details: " + employee);

        // Retrieve and print the Course bean
        Course course = context.getBean(Course.class);
        System.out.println("Course Details: " + course);
    }
}
