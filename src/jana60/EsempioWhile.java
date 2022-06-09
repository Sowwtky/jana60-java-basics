package jana60;

import java.util.Scanner;

public class EsempioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		boolean continuaAChiedere = true;
		int numero = 0;
		
		while(continuaAChiedere) {
			System.out.println("Dimmi un numero da 1 a 100");
			numero = scan.nextInt();
			
			if(numero > 0 && numero < 101) {
				continuaAChiedere = false;
			} else {
				System.out.println("Hai inserito un numero non valido");
			}
		}
		
		System.out.println("Numero inserito: " + numero);
		
		scan.close();
	}

}
