
package atividade1;

public class Triangle {
	double sideA;
	double sideB;
	double sideC;
	private double area = 0;
	
	public Triangle(double sideA, double sideB, double sideC) {
		this.validateTriangleSides(sideA, sideB, sideC);
		
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	public void calculateArea() {
		double p = calculateP();
		double result = Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
		
		this.setArea(result);		
	}
	
	private double calculateP() {
		return (this.sideA + this.sideB + this.sideC) / 2;
	}
	
	private double setArea(double area) {
		return this.area = area;
	}
	
	private void validateTriangleSides(double sideA, double sideB, double sideC) {
		double sideAAndB = sideA + sideB;
		double sideBAndC = sideB + sideC;
		double sideAAndC = sideA + sideC;
		
		if(sideAAndB < sideC) {
			throw new IllegalArgumentException("A soma dos lados A e B deve ser maior que o lado C");
		} else if(sideBAndC < sideA) {
			throw new IllegalArgumentException("A soma dos lados B e C deve ser maior que o lado A");
		} else if(sideAAndC < sideB) {
			throw new IllegalArgumentException("A soma dos lados A e C deve ser maior que o lado B");
		}
	}
	
	public double getSideA() {
		return this.sideA;
	}
	
	public double getSideB() {
		return this.sideB;
	}
	
	public double getSideC() {
		return this.sideC;
	}
	
	public double getArea() {
		return this.area;
	}	
}
