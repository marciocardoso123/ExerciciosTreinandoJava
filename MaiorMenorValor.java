import java.util.Scanner;

public class MaiorMenorValor {

	public static void main(String[] args) {
		// programa q leia 5 valores e traga o maior e o menor valor e media
		int num;
		int count = 0;
		int maior = 0;
		int menor = 0;
		int media = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Numero: ");
			num = leia.nextInt();
			if(num > maior) {
				maior = num;
			}else {
				menor = num;
			}
			//media
			media = media + num;
			count ++;
		}while(count < 5);
		System.out.println("O maior é " + maior);
		System.out.println("O menor é " + menor);
		System.out.println("A media é " + (media/5));
		
		
		
	}

}
