package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmCharge;
    private int batterySize,cylinders;


    public HybridCar(String name, String description, double avgKmCharge, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmCharge = avgKmCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmCharge() {
        return avgKmCharge;
    }

    public void setAvgKmCharge(double avgKmCharge) {
        this.avgKmCharge = avgKmCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
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
