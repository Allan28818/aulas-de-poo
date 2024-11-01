package atividade2;

public class Truck extends Vehicle {
    public Truck(String licensePlate, String brand, String model, int manufactureYear) {
        super(licensePlate, brand, model, manufactureYear);
    }

    @Override
    public double calculateIPVA() {
        double estimatedValue = 50000 - (2023 - getManufactureYear()) * 5000;
        return estimatedValue * 0.015;
    }

    @Override
    public void displayDetails() {
        System.out.println("Type: Truck");
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Manufacture Year: " + getManufactureYear());
        System.out.println("IPVA: $" + calculateIPVA());
        System.out.println();
    }
}
