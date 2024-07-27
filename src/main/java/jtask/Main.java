package jtask;

import jtask.classes.House;
import jtask.classes.Person;
import jtask.classes.Car;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class Main {
    public static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++)
            s += i;
        return s;
    }

    public static void main(String[] args) {
//        System.out.println("Hello from Java!\n");
//
//        House house = new House("1234 Elm St", 4, 250000.0, "Single Family", 1995);
//        house.displayInfo();
//
//        Person person = new Person("John Doe", 30, "Male", "456 Elm Street", "555-1234");
//        person.displayInfo();
//
//        Car car = new Car("Toyota", "Camry", 2020, 20000.0, "Blue", 15000);
//        car.displayInfo();
//        int a = 0, b = 0, c = 0;
//
//        System.out.printf("a = %d\nb = %d\nc = %d\n", a, b, c);

        SpringApplication.run(Main.class, args);
    }
}
