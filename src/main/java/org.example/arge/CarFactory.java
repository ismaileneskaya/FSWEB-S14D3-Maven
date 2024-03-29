package org.example.arge;

import org.example.company.Car;

public class CarFactory {

    public static void main(String[] args) {
        CarSkeleton electricCar= new ElectricCar("Tesla","ElectricCar",198,6);
        CarSkeleton hibridcar= new HybridCar("Toyota","Hibridcar",155,198,6);


        System.out.println(electricCar.drive());
        System.out.println(hibridcar.drive());
    }
}

