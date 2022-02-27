import java.util.Scanner;

public class DesafioDescubraAnotaCerta {

	public static void main(String[] args) {
		//programa que recebe uma nota de 0 e 10 até acertar o valor
		
		Scanner leia  =new Scanner(System.in);
		int nota;
		
		System.out.println("Nota: ");
		nota = leia.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota invalida! digite novamente");
			//para reiniciar basta usar Scanner
			nota = leia.nextInt();
		}
		
	}

}
