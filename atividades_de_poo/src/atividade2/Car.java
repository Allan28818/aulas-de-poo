package atividade2;

public class Car extends Vehicle{
	public Car(String licensePlate, String brand, String model, int manufactureYear) {
	        super(licensePlate, brand, model, manufactureYear);
	    }

	    @Override
	    public double calculateIPVA() {
	        double estimatedValue = 30000 - (2023 - this.getManufactureYear()) * 2000;
	        return estimatedValue * 0.04;
	    }

	    @Override
	    public void displayDetails() {
	        System.out.println("Type: Car");
	        System.out.println("License Plate: " + getLicensePlate());
	        System.out.println("Brand: " + getBrand());
	        System.out.println("Model: " + getModel());
	        System.out.println("Manufacture Year: " + getManufactureYear());
	        System.out.println("IPVA: $" + calculateIPVA());
	        System.out.println();
	    }
}
