package org.example.company;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
       Car car= new Car("Base car",6);
        printStartEngine(car);

        Car mitsubishi= new Mitsubishi("outlander",6);
        printStartEngine(mitsubishi);

        Car ford= new Ford("Ford Falcoon",8);
        printStartEngine(ford);

        Car holden1= new Holden("Holden Commodore",6);
        printStartEngine(holden1);
    }

    public static void printStartEngine(Car car){
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }

}