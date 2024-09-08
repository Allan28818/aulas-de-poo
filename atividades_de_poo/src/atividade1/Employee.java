package atividade1;

public class Employee {
	String name;
	double salary;
	double salaryIncreaseTax = 0;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;	
	}
	
	public void applySalaryIncrease() {
		if(this.salary >= 1 && this.salary <= 1000) {
			this.setSalaryIncreaseTax(0.15);			
		} else if(this.salary >= 1001 && this.salary <= 1500) {
			this.setSalaryIncreaseTax(0.10);
		} else if(this.salary >= 1501 && this.salary <= 2000) {
			this.setSalaryIncreaseTax(0.05);
		}
		
		double increasingAmount = this.salary * this.salaryIncreaseTax;
		this.salary += increasingAmount;
	}
	
	private void setSalaryIncreaseTax(double increaseTax) {
		this.salaryIncreaseTax = increaseTax;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
