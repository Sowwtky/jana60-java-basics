package jana60;

import java.util.Random;
import java.util.Scanner;

public class EsempiArray {

	public static void main(String[] args) {
		/*
		 * Genriamo un array di 10 numeri casuali
		 * Chiediamo all'utente di dirci un numero compreso tra 1 e 100
		 * e verifichiamo se il numero é presente nell'array oppure no
		*/
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		//creo array di 10 numeri
		int[] numeri = new int [10];
		
		
		for(int i = 0; i < numeri.length; i++) {
			numeri[i] = rand.nextInt(100) + 1;
			//System.out.println(numeri[i]);
		}
		
		int sceltaUtente;
		do {
			System.out.println("Dimmi un numero tra 1 e 100:");
			sceltaUtente = scan.nextInt();
			
			if (sceltaUtente < 1 || sceltaUtente > 100) {
				System.out.println("Numero non valido");
			}
			
		} while (sceltaUtente < 1 || sceltaUtente > 100);
		
		
		//verifico se la scelta utente é presente nell'array
		
		boolean trovato = false;
		int counter = 0;
		
		while(trovato == false && counter < numeri.length) {
			if(numeri[counter] == sceltaUtente) {
				trovato = true;
				System.out.println("Complimenti, hai vinto!");
			} else {
				counter++;
			}
			
		}
		
		if (trovato == false) {
			System.out.println("Hai perso!");
		}
		
		scan.close();
	}

}
