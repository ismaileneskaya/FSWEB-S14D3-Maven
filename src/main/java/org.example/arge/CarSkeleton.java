package org.example.arge;

public class CarSkeleton {
    public static final String CLASS_NAME="Class name: ";
    private String name;
    private String description;


    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description){
        this.name=name;
        this.description=description;
    }

    public CarSkeleton(String tesla, String electricalCar, int i) {
    }

    public String startEngine(){
        System.out.println(CLASS_NAME +getClass().getSimpleName());
        return getName()+"starting engine";
    }

    public String drive(){
        runEngine(this);
        return getName()+"is driving";
    }

    public void runEngine(CarSkeleton carSkeleton) {
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
