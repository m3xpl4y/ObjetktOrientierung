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
    protected double restFuel;
    double drivenKM;

    public double getConsum() {
        return consumation;
    }

    public void setConsum(double consumation) {
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

    public void driveVehicle(int a)
    {
        double consum = consumation / 100;
        for (int i = 1; i <= a; i++) {
            drivenKM = i;
            restFuel = this.fuelCapacity - (i*consum);
            if(this.restFuel < consum)
                break;
        }
        if(restFuel > consum)
        {
            System.out.println("Willkommen in Valhalla");
            System.out.println("Du bist " + this.drivenKM +" Kilometer gefahren");
            System.out.println("Der durchschnittsverbrauch lag bei " + consumation +".");
            System.out.println("Tankinhalt: " + restFuel);
            System.out.println("Tankinhalt beim start: " + fuelCapacity);
        }
        if(restFuel < consum)
        {
            double refuel = 0;
            double restKM = a - drivenKM;
            double neededFuel = restKM * consum;
            System.out.println("Du bist " + this.drivenKM +" Kilometer gefahren");
            System.out.println("Verbleidender Tankinhalt: " + restFuel);
            System.out.println("Tankinhalt beim start: " + fuelCapacity);
            System.out.println("Ihr Treibstoff reicht nicht um die gesamte Reststrecke von " + restKM + " Kilometer zu fahren!");
            System.out.println("Sie müssen noch mindestens " + neededFuel + " Liter Treibstoff tanken!");
            goRefuel(refuel);
        }
    }
    public void accelerate(double speed)
    {
        if(speed < 1)
        {
            System.out.println("Na dann, bleib zuhause!");
        }
        else if(speed >=1 && speed <= 60)
        {
            double percentage = (int)consumation*(25.0f/100.0f);
            consumation = consumation - percentage;
        }
        else if(speed >= 61 && speed <= 90)
        {
            double percentage = (int)consumation*(15.0f/100.0f);
            consumation = consumation - percentage;
        }
        else if(speed >= 91 && speed <= 130)
        {
            double percentage = (int)consumation*(100.0f/100.0f);
            consumation = percentage;
        }
        else  if(speed >= 131 && speed <= 180)
        {
            double percentage = (int)consumation*(15.0f/100.0f);
            consumation = consumation + percentage;
        }
        else if(speed >= 181 && speed <= 250)
        {
            double percentage = (int)consumation*(25.0f/100.0f);
            consumation = consumation + percentage;
        }
        else
        {
            System.out.println("Fliegen geht nicht!");
        }
    }
    public void goRefuel(double fuel)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte Tanken, geben Sie die Liter Anzahl an: ");
        fuel = sc.nextDouble();
        fuelCapacity = fuel + restFuel;
        System.out.println("Sie haben " + fuel + " getankt!");
        System.out.println("Neuer Tankinhalt in Liter: " + fuelCapacity);
    }
}
