package com.klef.jfsd.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ApplicationConfig {

    // Define Employee Bean with Constructor Injection
    @Bean
    public Employee employee() {
        return new Employee(
            101, 
            "John Doe", 
            75000.0, 
            "IT", 
            Arrays.asList("Java", "Spring", "Hibernate")
        );
    }

    // Define Instructor Bean
    @Bean
    public Instructor instructor() {
        Instructor instructor = new Instructor();
        instructor.setInstructorId(1);
        instructor.setName("Dr. Smith");
        instructor.setEmail("dr.smith@example.com");
        instructor.setPhoneNumber("1234567890");
        return instructor;
    }

    // Define Course Bean with Setter Autowiring
    @Bean
    public Course course() {
        Course course = new Course();
        course.setCourseId(501);
        course.setCourseName("Spring Framework");
        course.setCredits(3);
        course.setInstructor(instructor()); // Autowiring via setter
        return course;
    }
}
