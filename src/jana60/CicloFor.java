package jana60;

public class CicloFor {

	public static void main(String[] args) {
		// stampare i primi 10 numeri naturali (1-10)
		
		//for (int i = 1; i < 11; i++) {
		//  System.out.println(i);
		//}
		
		//for (int i = 0; i < 10; i++) {
		//	System.out.println("Interazione " + i);
		//	int numero = i + 1;
		//	System.out.print(" - numero " + numero);
		//}
		
		//for (int i = 1; i <= 10; i = i + 2) {
		//	System.out.println(i);
		//}
		int somma = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("indice = " + i);
			somma = somma + i;
			System.out.println("somma = " + somma);
		}
		System.out.println(somma);
	}

}
