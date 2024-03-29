package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double batterySize;
    private int cylinders;


    public ElectricCar(String name, String description, double avgKmPerCharge, int cylinders) {
        super(name, description);
        this.batterySize = avgKmPerCharge;
        this.cylinders = cylinders;

    }

    public double getAvgKmPerCharge() {
        return batterySize;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.batterySize = avgKmPerCharge;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String drive() {
        return super.drive();
    }
}
