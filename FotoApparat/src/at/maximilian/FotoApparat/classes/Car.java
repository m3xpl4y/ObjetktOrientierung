package at.maximilian.FotoApparat.classes;

public class Car extends Vehicle{
    double trunkCapacity;
    double cubicCapacity;
    static final char DRIVER_LICENCE = 'B';

    public Car() {
    }

    public Car(double trunkCapacity, double cubicCapacity) {
        this.trunkCapacity = trunkCapacity;
        this.cubicCapacity = cubicCapacity;
    }

    public char getDriverLicence() {
        return DRIVER_LICENCE;
    }

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
}
