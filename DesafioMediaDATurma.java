import java.util.Scanner;

public class DesafioMediaDATurma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] alunos = {"Camila",
				           "Lucas",
		                   "Bruna",
		                   "Pedro"};
		
		double media = calculaMediaTurma(alunos,leia);
		System.out.printf("Media da turma %.1f" ,media);
	}
	static double calculaMediaTurma(String[] alunos,Scanner scanner) {
		double soma =0;
		for(String aluno : alunos) {
			System.out.printf("Nota do aluno %s: ",aluno);
			double nota = scanner.nextDouble();
			soma = soma + nota;
		}
		
		return soma / alunos.length;
	}

}
