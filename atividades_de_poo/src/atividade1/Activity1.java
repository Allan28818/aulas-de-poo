package atividade1;

public class Activity1 {
	public Activity1() {		
		// Quest�o 1: Crie um programa para ler os dados de um produto em estoque (nome, pre�o e
		// quantidade no estoque). Em seguida:
		Stock myStock = new Stock("TV", 1300, 2000);	
		myStock.showStockItems();
		myStock.sellItem("TV", 1);
		System.out.println("Caixa: " + myStock.getTotalMoney());
		myStock.showStockItems();
		
		
		// 2 - Fa�a um programa que leia os dados de um funcion�rio (nome e sal�rio). Em seguida,
		// aplique um aumento com base no sal�rio do funcion�rio a saber:
		// � Se o sal�rio do funcion�rio estiver entre 1 e 1000, aplique um aumento de 15%;
		// � Se o sal�rio do funcion�rio estiver entre 1001 e 1500, aplique um aumento de
		// 10%;
		// � Se o sal�rio do funcion�rio estiver entre 1501 e 2000, aplique um aumento de 5%.
		// Ao final imprima o sal�rio antigo e o atual do funcion�rio, de acordo com o aumento
		// estabelecido.
		Employee employee = new Employee("Allan", 1001);
		System.out.println("Sal�rio inicial: " + employee.getSalary());
		employee.applySalaryIncrease();
		System.out.println("Sal�rio ap�s aumento: " + employee.getSalary());
		
		// 3 � Crie um programa para ler as medidas dos lados de dois tri�ngulos X e Y. Em seguida,
		// apresente o valor das �reas dos dois tri�ngulos e informe qual dos tri�ngulos possui a
		// maior �rea.
		// A f�rmula para calcular a �rea do tri�ngulo a partir das medidas de seus lados "a", "b" e
		// "c" � a seguinte (f�rmula de Heron):
		Triangle triangle1 = new Triangle(14, 12, 10);
		Triangle triangle2 = new Triangle(30, 37, 42);		
		
		triangle1.calculateArea();
		triangle2.calculateArea();
		
		if(triangle1.getArea() > triangle2.getArea()) {
		  System.out.println("O tri�ngulo 1 � o de maior �rea!");
		} else if(triangle2.getArea() > triangle1.getArea()) {
		  System.out.println("O tri�ngulo 2 � o de maior �rea!");
		} else if(triangle1.getArea() == triangle2.getArea()) {
		  System.out.println("Os tri�ngulo 1 e 2 s�o iguais!");
		} else {
		  System.out.println("Algo de errado ocorreu no c�lculo da �rea dos tri�ngulo. Tente novamente!");
	    }
		
		// 4 - Fa�a um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos
		// tr�s trimestres do ano:
		// � Primeiro trimestre vale 30 pontos;
		// � Segundo e terceiro trimestre valem 35 pontos cada.
		// Apresente a nota final, considerando o somat�rio dos tr�s trimestres. O programa deve
		// realizar as seguintes valida��es:
		// � Se o usu�rio digitar uma nota fora do intervalo de cada trimestre, o programa
		// dever� solicitar a digita��o novamente, at� que o usu�rio informe a nota dentro
		// do intervalo correto. Utilize a estrutura de repeti��o (while).
		// � Ap�s o somat�rio das notas, informe se o aluno est� aprovado (maior ou igual a
		// 70) ou reprovado (menor que 70). Em caso de reprova��o, informe quantos
		// pontos faltam para ele obter o m�nimo para ser aprovado.
		
		SchoolGrades schoolGrades = new SchoolGrades();
	}
}
