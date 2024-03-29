package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKamPerLiter;
    private int cylinder;


    public GasPoweredCar(String name, String description, double avgKamPerLitre, int cylinder) {
        super(name, description);
        this.avgKamPerLiter = avgKamPerLitre;
        this.cylinder = cylinder;
    }

    public double getAvgKamPerLiter() {
        return avgKamPerLiter;
    }

    public void setAvgKamPerLiter(double avgKamPerLiter) {
        this.avgKamPerLiter = avgKamPerLiter;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
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
