package org.example.company;

import java.util.Objects;

public class Car {
    private int cylinders,wheels;
    private String name;
    private boolean engine;



    public Car(String name, int cylinders){
        this.cylinders=cylinders;
        this.name=name;
        this.engine=Boolean.TRUE;
        this.wheels=4;
    }




    public String startEngine(){
        printSimpleName();
        return "the car's engine is starting";
    }
    public String accelerate(){
        printSimpleName();
        return "the car is accelerating";
    }
    public String brake(){
        printSimpleName();
        return "the car is braking";
    }

    public void printSimpleName(){
        System.out.println("Class name:"+getClass().getName());
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }


    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", wheels=" + wheels +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
