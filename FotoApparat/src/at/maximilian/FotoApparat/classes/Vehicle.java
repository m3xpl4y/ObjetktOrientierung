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
    double consumation;

    public double getConsumation() {
        return consumation;
    }

    public void setConsumation(double consumation) {
        this.consumation = consumation;
    }

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

    public double driveVehicle(double a)
    {
        a = consumation / 100 * a;
        if(this.fuelCapacity > a)
        {
            this.fuelCapacity = this.fuelCapacity - a;
        }
        if(this.fuelCapacity < a)
        {
            System.out.println("Gehe Tanken");
            goRefuel();
        }
        return this.fuelCapacity;
    }
    public void goRefuel()
    {
        System.out.println("Du hast kein Treibstoff mehr, du musst Tanken!");
    }
}
