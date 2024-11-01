package atividade2;

public class Bus extends Vehicle {
    public Bus(String licensePlate, String brand, String model, int manufactureYear) {
        super(licensePlate, brand, model, manufactureYear);
    }

    @Override
    public double calculateIPVA() {
        double estimatedValue = 40000 - (2023 - getManufactureYear()) * 3000;
        return estimatedValue * 0.02;
    }

    @Override
    public void displayDetails() {
        System.out.println("Type: Bus");
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Manufacture Year: " + getManufactureYear());
        System.out.println("IPVA: $" + calculateIPVA());
        System.out.println();
    }
}
