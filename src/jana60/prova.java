package jana60;

import java.util.Scanner;

public class prova {

	public static void main(String[] args) {
		
		//dichiaro variabile numero
		int numero;
		
		//inizializzo scanner
		Scanner scan = new Scanner (System.in);
		
		//chiedo un numero all'utente
		System.out.println("Digita un numero intero:");
		
		//salvo input nella variabile numero
		numero = scan.nextInt();
		
		//restituisco ad utente il numero inserito
		System.out.println("Il numero inserito é: " + numero);
		
		scan.close();
	}

}
