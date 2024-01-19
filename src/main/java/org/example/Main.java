package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        // Retrieve the Car bean
        Car car = (Car) context.getBean("carBean");

        // Print details of the car
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
