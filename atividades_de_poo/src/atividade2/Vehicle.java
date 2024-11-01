package atividade2;

public abstract class Vehicle {
    private String licensePlate;
    private String brand;
    private String model;
    private int manufactureYear;

    public Vehicle(String licensePlate, String brand, String model, int manufactureYear) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.manufactureYear = manufactureYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public abstract double calculateIPVA();
    public abstract void displayDetails();
}
