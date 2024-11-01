package atividade2;
import java.util.Scanner;

public class Activity2 {
	public Activity2() throws InsufficientBalance {
		// Exerc�cio 1 (Heran�a) � Conta Banc�ria: Elabore uma classe ContaBancaria, com os
		// seguintes membros:

		// Conta banc�ria	
		BankAccount bankAccount = new BankAccount("Allan", "0123", 1000);
		bankAccount.showBalance(null);
		bankAccount.deposit(2000);
		bankAccount.withdraw(100);
		
		// Conta poupan�a
		
		SavingAccount savingAccount = new SavingAccount("Allan", "0123", 2000);
		savingAccount.setDaysPassed(3);
		savingAccount.calculateNewBalance();
		
		// Conta especial
		
		SpecialAccount specialAccount = new SpecialAccount("Allan", "0123", 2000, 1000);
		
		specialAccount.withdraw(2500);
		
		// Exerc�cio 2 (Classe Abstrata) -Implemente um sistema de gerenciamento de ve�culos
		// de uma frota de transporte que utilize uma classe abstrata. O sistema deve permitir a
		// cria��o de diferentes tipos de ve�culos: Carro, Caminh�o e �nibus.
		Car car = new Car("ABC-1234", "Toyota", "Corolla", 2020);
		car.calculateIPVA();
		car.displayDetails();
		
		Truck truck = new Truck("DEF-5678", "Volvo", "FH", 2015);
		truck.calculateIPVA();
		truck.displayDetails();
		
		Bus bus = new Bus("GHI9101", "Mercedes", "Monobloco", 2020);
		bus.calculateIPVA();
		bus.displayDetails();
		
		// Exerc�cio 3 (Interface) - Desenvolva um sistema para gerenciar um hotel utilizando
		// interfaces m�ltiplas.
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
