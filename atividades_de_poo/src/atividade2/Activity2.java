package atividade2;
import java.util.Scanner;

public class Activity2 {
	public Activity2() throws InsufficientBalance {
		// Exercício 1 (Herança) – Conta Bancária: Elabore uma classe ContaBancaria, com os
		// seguintes membros:

		// Conta bancária	
		BankAccount bankAccount = new BankAccount("Allan", "0123", 1000);
		bankAccount.showBalance(null);
		bankAccount.deposit(2000);
		bankAccount.withdraw(100);
		
		// Conta poupança
		
		SavingAccount savingAccount = new SavingAccount("Allan", "0123", 2000);
		savingAccount.setDaysPassed(3);
		savingAccount.calculateNewBalance();
		
		// Conta especial
		
		SpecialAccount specialAccount = new SpecialAccount("Allan", "0123", 2000, 1000);
		
		specialAccount.withdraw(2500);
		
		// Exercício 2 (Classe Abstrata) -Implemente um sistema de gerenciamento de veículos
		// de uma frota de transporte que utilize uma classe abstrata. O sistema deve permitir a
		// criação de diferentes tipos de veículos: Carro, Caminhão e Ônibus.
		Car car = new Car("ABC-1234", "Toyota", "Corolla", 2020);
		car.calculateIPVA();
		car.displayDetails();
		
		Truck truck = new Truck("DEF-5678", "Volvo", "FH", 2015);
		truck.calculateIPVA();
		truck.displayDetails();
		
		Bus bus = new Bus("GHI9101", "Mercedes", "Monobloco", 2020);
		bus.calculateIPVA();
		bus.displayDetails();
		
		// Exercício 3 (Interface) - Desenvolva um sistema para gerenciar um hotel utilizando
		// interfaces múltiplas.
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days for the stay: ");
        int days = scanner.nextInt();

        System.out.print("Enter the number of people: ");
        int people = scanner.nextInt();

        Accommodation simpleRoom = new SimpleRoom(people);
        Accommodation doubleRoom = new DoubleRoom(people);
        Accommodation suite = new Suite(people);

        System.out.println("Accommodation Details:");
        simpleRoom.displayDetails(days);
        doubleRoom.displayDetails(days);
        suite.displayDetails(days);

        scanner.close();
	}
}
