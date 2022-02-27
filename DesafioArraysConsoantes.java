import java.util.Scanner;

public class DesafioArraysConsoantes {

	public static void main(String[] args) {
		// Vetor de consoantes contadas
		Scanner leia =new Scanner(System.in);
		int qtdConsoante =0;
		int count =0;
		String[] consoante = new String[6];
		
		
		do {
			System.out.println("digite letra: ");
			String letra = leia.next();
			if(! (letra.equalsIgnoreCase("a")|
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u") ) ) {
				consoante[count] = letra;
				qtdConsoante ++;
			}		
			count ++;
		}while(count < consoante.length );
		
		System.out.println("consoantes: ");
		
		//foreach  para cada elemento dentro do array imprima o mesmo
		for (String variaveis : consoante) {
			if( variaveis  != null) {
				System.out.print( variaveis  + " ");
			}
		}

	}

}
