
interface EcoFriendly {
    void charge();
}

abstract class Vehicle {
    String brand;
    String model;
    int year;

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public abstract void calculateFuelEfficiency();
}

class Car extends Vehicle {
    int numberOfDoors;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numberOfDoors);
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Car Fuel Efficiency: 7MPG");
    }
}

class Motorcycle extends Vehicle {
    String type;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Fuel Efficiency: 45MPG");
    }
}

class ElectricCar extends Car implements EcoFriendly {
    int batteryCapacity;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryCapacity + " kwh");
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Electric Car Efficiency: 4miles/kwh");
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging via fast charger...");
    }
}

class ElectricBike extends Motorcycle implements EcoFriendly {
    int batteryCapacity;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery: " + batteryCapacity + " kWh");
    }

    @Override
    public void calculateFuelEfficiency() {
        System.out.println("Electric Bike Efficiency: 7 miles/kWh");
    }

    @Override
    public void charge() {
        System.out.println("Electric Bike is charging via standard plug...");
    }
}

public class EcoCar {
    public static void main(String[] args) {

        Vehicle v1 = new Car();
        v1.brand = "Toyota";
        v1.model = "Crown";
        v1.year = 2022;
        ((Car) v1).numberOfDoors = 4;

        Vehicle v2 = new Motorcycle();
        v2.brand = "Yamaha";
        v2.model = "Harun Pipe";
        v2.year = 2021;
        ((Motorcycle) v2).type = "Sport";

        Vehicle v3 = new ElectricCar();
        v3.brand = "Tesla";
        v3.model = "Model 3";
        v3.year = 2023;
        ((ElectricCar) v3).numberOfDoors = 4;
        ((ElectricCar) v3).batteryCapacity = 75;

        Vehicle v4 = new ElectricBike();
        v4.brand = "BYD";
        v4.model = "Mone porteche na";
        v4.year = 2023;
        ((ElectricBike) v4).type = "Cruiser";
        ((ElectricBike) v4).batteryCapacity = 2;

        Vehicle[] vehicles = { v1, v2, v3, v4 };
        for (Vehicle v : vehicles) {
            System.out.println("\n--- Vehicle Info ---");
            v.displayInfo();
            v.calculateFuelEfficiency();
        }

        System.out.println("\n--- Charging Electric Vehicles ---");
        EcoFriendly eco1 = (EcoFriendly) v3;
        eco1.charge();

        EcoFriendly eco2 = (EcoFriendly) v4;
        eco2.charge();
    }
}
