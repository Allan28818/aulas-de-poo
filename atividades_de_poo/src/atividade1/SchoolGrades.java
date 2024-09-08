package atividade1;
import java.util.Scanner;

public class SchoolGrades {
	double maxTrimestersGrades[] = {30, 35, 35};
	double gradesSum = 0;
	double finalAverage = 70;
	
	
	public SchoolGrades() {		
		Scanner scanner = new Scanner(System.in);
		
		try {
			int currentTrimester = 0;
			int stopCalculatingTrimester = this.maxTrimestersGrades.length;
			
			while(currentTrimester < stopCalculatingTrimester) {
				double currentUserGrade;
				double currentTrimesterMaxGrade = maxTrimestersGrades[currentTrimester];
				
				System.out.println("Digite a nota do " + (currentTrimester + 1) + "º trimestre:");
				currentUserGrade = scanner.nextDouble();
				
				if(currentUserGrade > currentTrimesterMaxGrade || currentUserGrade < 0) {
					System.out.println("Digite uma nota que esteja entre 0 e " + currentTrimesterMaxGrade);
					continue;
				}
				
				gradesSum += currentUserGrade;
				currentTrimester++;
			}
		} finally {
			scanner.close();
			this.checkIsUserAproved();
		}
		
	}
	
	private void checkIsUserAproved() {
		if(this.gradesSum < this.finalAverage) {
			System.out.println("Usuário reprovado!");
			System.out.println("Faltam " + (this.finalAverage - this.gradesSum) + " pontos para o aluno passar");
		} else if(this.gradesSum >= this.finalAverage) {
			System.out.println("Usuário aprovado!");
		}
	}
}
