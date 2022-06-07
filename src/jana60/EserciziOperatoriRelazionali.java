package jana60;

import java.util.Scanner;

public class EserciziOperatoriRelazionali {

	public static void main(String[] args) {
		// 
		
		int anniUtente1;
		int anniUtente2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci anni primo utente:");
		anniUtente1 = scan.nextInt();
		
		System.out.println("Inserisci anni secondo utente:");
		anniUtente2 = scan.nextInt();
		
		
		System.out.println("Etá utente 1: " + anniUtente1);
		System.out.println("Etá utente 2: " + anniUtente2);
		
		
		if (anniUtente1 >= 0 && anniUtente2 >= 0) {
			if (anniUtente1 > anniUtente2) {
				System.out.println("Utente 1 é piú grande di utente 2");
			} else if (anniUtente1 == anniUtente2) {
				System.out.println("I due utenti hanno la stessa etá");
			} else {
				System.out.println("Utente 2 é piú grande di utente 1");
			} 
		} else {
			System.out.println("L'etá non puó essere negativa. Riprova");
		}
		scan.close();
			
		}

	}


