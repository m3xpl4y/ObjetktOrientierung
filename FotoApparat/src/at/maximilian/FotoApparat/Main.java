package at.maximilian.FotoApparat;

import at.maximilian.FotoApparat.classes.*;

public class Main {

    static InputScanner scan = new InputScanner(); //if placed here, can be used outside the main method

    public static void main(String[] args) {

        String cameraName = "Nikon";

        FotoAparat nikon = new FotoAparat(cameraName, "Japan", 24.7,6400,3.2);
        SdCard sdCard1 = new SdCard();
        Objektiv obj1 = new Objektiv(10, 50, "Nikon");
        sdCard1.setSdBrand("SanDisk");
        sdCard1.setSdSize(64);
        sdCard1.setPicSize(4);
        nikon.setSdCard(sdCard1);
        nikon.setObjektiv(obj1);
        nikon.setType("D610");
        nikon.setOwner("Maximilian");
        nikon.selfTimer();

        nikon.machFoto();
        System.out.println("Speicher SD größe: " + sdCard1.getSdSize());
        nikon.productSheet();
        System.out.println("Mein Kamera der Marke " + nikon.getBrand() + " hat eine Brennweite von  " + nikon.getObjektiv().getFocalLength());




//
//        double fuel = 0;
//        double consum = 0;
//        int km = 0;
//        double speed = 0;
//        FotoAparat canon = new FotoAparat("Canon", "Japan", 28.7, 40000, 3, 80);
//        //canon.setOwner("Max");
//        canon.machFoto();
//        canon.productSheet();
//        System.out.println(canon.getOwner());
//
//        Car car1 = new Car(250, 2.2, "BMW");
//        //car1.setBrand("BMW");
//        car1.setType("525xD");
//        car1.setConstructionYear(2013);
//        car1.setPrice(25800);
//        car1.setHorsePower(218);
//        car1.setMaxSpeed(247);
//        System.out.println(car1.getBrand());
//        System.out.println("Bitte Tanken: ");
//        car1.setFuelCapacity(scan.inputDouble(fuel));
//        System.out.println("Sie haben " + car1.getFuelCapacity() + " Liter getankt!");
//        System.out.println("Wie hoch ist der Verbrauch auf 100 km?");
//        car1.setConsum(scan.inputDouble(consum));
//        System.out.println("Wie schnell möchten Sie fahren?");
//        car1.accelerate(scan.inputDouble(speed));
//        System.out.println("Wie weit möchten Sie fahren? KM Anzahl angeben");
//        car1.driveVehicle(scan.inputInt(km));
//
//        Vehicle veh1 = new Vehicle();
//        Car car2 = new Car();
//        car2.setTrunkCapacity(12);

    }
}
