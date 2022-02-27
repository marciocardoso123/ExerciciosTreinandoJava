
public class LidandoArrays {

	public static void main(String[] args) {
		
		//uso de array sem valor definido [2]
		//quando se define a qtd de elementos n usa new
		int  [] idade = new int[10];
		idade[0] = 27;
		idade[1] = 31;
		
		System.out.println("idade: "+ idade[0]);
		System.out.println("idade: "+ idade[1]);
		System.out.println("idade: "+ idade[2]);
		
		
		int[] i = {10,25};
		System.out.println("i 0 =" +i[0]);
		System.out.println("i 1 =" +i[1]);
		
		//quando usa new n se define elementos
		int[] idades = new int[] {12,35,45,22,9,37,51,61};
		
		//forech
		for (int Aidade: idades) {
		System.out.println("Aidade " + idades);
			}
		//for tradicional
		for (int a = 0;a< idades.length;a++) {
			int Aidade = idades[a];
			System.out.println("Idade: " + Aidade + " é maior que 18 anos?");
		}
		
		//se idade for maior ou igual a 18
		for(int idade1 : idades) {
			if(idade1 >= 18) {
				System.out.println("As idade "+ idade1+ " é maior que 18!");
			}
			
		}
		
		
		}
}