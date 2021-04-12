package at.maximilian.FotoApparat.classes;

public class Motorbike extends Vehicle{
    char driverLicence = 'A';
    boolean isNakedBike;
    //pedale

    public Motorbike() {
    }

    public Motorbike(boolean isNakedBike) {
        this.isNakedBike = isNakedBike;
    }
}
