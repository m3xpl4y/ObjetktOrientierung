package at.maximilian.FotoApparat;

import at.maximilian.FotoApparat.classes.Car;
import at.maximilian.FotoApparat.classes.FotoAparat;
import at.maximilian.FotoApparat.classes.Motorbike;

public class Main {

    public static void main(String[] args) {
//        String CameraName = "Nikon";
//        FotoAparat nikon = new FotoAparat(CameraName, "Japan", 24.7,6400,3.2,135);
//        nikon.setType("D610");
//        nikon.setOwner("Maximilian");
//        nikon.selfTimer();
//        nikon.productSheet();
//        nikon.machFoto();

        Car car1 = new Car(250, 2.2);
        car1.setBrand("BMW");
        car1.setType("525xD");
        car1.setConstructionYear(2013);
        car1.setPrice(25800);
        car1.setFuelCapacity(55.8);
        car1.setHorsePower(218);
        car1.setMaxSpeed(247);
        System.out.println(car1.getBrand() + " " + car1.getDriverLicence());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());
        car1.driveVehicle();
        System.out.println(car1.getFuelCapacity());

        //        Motorbike bike1 = new Motorbike(true);
//        bike1.setBrand("Harley Davidson");
//        car1.
    }
}
