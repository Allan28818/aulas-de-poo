package atividade1;

public class Activity1 {
	public Activity1() {		
		// Questão 1: Crie um programa para ler os dados de um produto em estoque (nome, preço e
		// quantidade no estoque). Em seguida:
		Stock myStock = new Stock("TV", 1300, 2000);	
		myStock.showStockItems();
		myStock.sellItem("TV", 1);
		System.out.println("Caixa: " + myStock.getTotalMoney());
		myStock.showStockItems();
		
		
		// 2 - Faça um programa que leia os dados de um funcionário (nome e salário). Em seguida,
		// aplique um aumento com base no salário do funcionário a saber:
		// • Se o salário do funcionário estiver entre 1 e 1000, aplique um aumento de 15%;
		// • Se o salário do funcionário estiver entre 1001 e 1500, aplique um aumento de
		// 10%;
		// • Se o salário do funcionário estiver entre 1501 e 2000, aplique um aumento de 5%.
		// Ao final imprima o salário antigo e o atual do funcionário, de acordo com o aumento
		// estabelecido.
		Employee employee = new Employee("Allan", 1001);
		System.out.println("Salário inicial: " + employee.getSalary());
		employee.applySalaryIncrease();
		System.out.println("Salário após aumento: " + employee.getSalary());
		
		// 3 – Crie um programa para ler as medidas dos lados de dois triângulos X e Y. Em seguida,
		// apresente o valor das áreas dos dois triângulos e informe qual dos triângulos possui a
		// maior área.
		// A fórmula para calcular a área do triângulo a partir das medidas de seus lados "a", "b" e
		// "c" é a seguinte (fórmula de Heron):
		Triangle triangle1 = new Triangle(14, 12, 10);
		Triangle triangle2 = new Triangle(30, 37, 42);		
		
		triangle1.calculateArea();
		triangle2.calculateArea();
		
		if(triangle1.getArea() > triangle2.getArea()) {
		  System.out.println("O triângulo 1 é o de maior área!");
		} else if(triangle2.getArea() > triangle1.getArea()) {
		  System.out.println("O triângulo 2 é o de maior área!");
		} else if(triangle1.getArea() == triangle2.getArea()) {
		  System.out.println("Os triângulo 1 e 2 são iguais!");
		} else {
		  System.out.println("Algo de errado ocorreu no cálculo da área dos triângulo. Tente novamente!");
	    }
		
		// 4 - Faça um programa para ler o nome de um aluno e as três notas que ele obteve nos
		// três trimestres do ano:
		// • Primeiro trimestre vale 30 pontos;
		// • Segundo e terceiro trimestre valem 35 pontos cada.
		// Apresente a nota final, considerando o somatório dos três trimestres. O programa deve
		// realizar as seguintes validações:
		// • Se o usuário digitar uma nota fora do intervalo de cada trimestre, o programa
		// deverá solicitar a digitação novamente, até que o usuário informe a nota dentro
		// do intervalo correto. Utilize a estrutura de repetição (while).
		// • Após o somatório das notas, informe se o aluno está aprovado (maior ou igual a
		// 70) ou reprovado (menor que 70). Em caso de reprovação, informe quantos
		// pontos faltam para ele obter o mínimo para ser aprovado.
		
		SchoolGrades schoolGrades = new SchoolGrades();
	}
}
