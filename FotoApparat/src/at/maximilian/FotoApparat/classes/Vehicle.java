package at.maximilian.FotoApparat.classes;

import java.util.Scanner;

public class Vehicle {
    String brand;
    String type;
    String honk = "HONK";
    int horsePower;
    int constructionYear;
    double price;
    double fuelCapacity;
    int maxSpeed;

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void driveVehicle()
    {
        if(this.fuelCapacity > 7.8)
        {
            this.fuelCapacity = this.fuelCapacity - 7.8;
        }
        if(this.fuelCapacity < 7.8)
        {
            System.out.println("Gehe Tanken");
            goRefuel();

        }
    }
    public void goRefuel()
    {
        System.out.println("Du kannst nicht Fahren da du nicht getankt hast");
        System.out.println("Bitte Treibstoff Liter angeben:");
        this.fuelCapacity = 35;
    }
}
