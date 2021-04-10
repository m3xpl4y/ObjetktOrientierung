package at.maximilian.FotoApparat;

import at.maximilian.FotoApparat.classes.Car;
import at.maximilian.FotoApparat.classes.InputScanner;

import java.nio.channels.ScatteringByteChannel;

public class Main {

    InputScanner scan = new InputScanner(); //if placed here, can be used outside the main method

    public static void main(String[] args) {

//        String cameraName = "Nikon";
//        FotoAparat nikon = new FotoAparat(cameraName, "Japan", 24.7,6400,3.2,135);
//        nikon.setType("D610");
//        nikon.setOwner("Maximilian");
//        nikon.selfTimer();
//        nikon.productSheet();
//        nikon.machFoto();
//
//        FotoAparat canon = new FotoAparat("Canon", "Japan", 28.7, 40000, 3, 80);
//        //canon.setOwner("Max");
//        canon.machFoto();
//        canon.productSheet();
//        System.out.println(canon.getOwner());

        Car car1 = new Car(250, 2.2);
        car1.setBrand("BMW");
        car1.setType("525xD");
        car1.setConstructionYear(2013);
        car1.setPrice(25800);
        car1.setFuelCapacity(55.8);
        car1.setHorsePower(218);
        car1.setMaxSpeed(247);
        car1.setConsumation(7.8);

        car1.driveVehicle(100);
        System.out.println(car1.getFuelCapacity());

    }
}
