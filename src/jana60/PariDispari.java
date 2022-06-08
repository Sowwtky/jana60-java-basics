package jana60;

import java.util.Random;
import java.util.Scanner;

public class PariDispari {

	public static void main(String[] args) {
		/*Utente sceglie pari o dispari
		 * Utente sceglie numero da 0 a 5
		 * Computer estrae un numero random da 0 a 5
		 * Se la somma é pari e utente ha scelto pari vince utente
		 * altrimenti vince computer
		 * se la somma é dispari e utente ha scelto dispari vince utente
		 * altrimenti vince computer*/
		
		Scanner scan = new Scanner(System.in);
		
		boolean sceltaUtentePari;
		boolean puoiProcedere = true;
		
		System.out.println("Scegli pari o dispari:");
		String scelta = scan.nextLine();
		
		if(scelta.equalsIgnoreCase("pari")) {
			sceltaUtentePari = true;
			
		}else if (scelta.equalsIgnoreCase("dispari")){
			sceltaUtentePari = false;
		}else {
			System.out.println("Scelta non valida");
			puoiProcedere = false;
			sceltaUtentePari = false;
		}
		 if (puoiProcedere) {
			 System.out.println("Procediamo");
			 System.out.println("Tira un numero da 0 e 5");
			 int numeroUtente = scan.nextInt();
			 
			 //computer tira un numero da 0 a 5
			 Random randomGenerator = new Random();
			 int numeroComputer = randomGenerator.nextInt(6);
			 
			 
			 System.out.println("Hai scelto: " + numeroUtente);
			 System.out.println("Il computer ha scelto: " + numeroComputer);
			 
			 int somma = numeroUtente + numeroComputer;
			 
			 if((somma % 2 ) == 0) {
				if (sceltaUtentePari) {
					System.out.println("Hai vinto!");
				} else {
					System.out.println("Hai perso!");
				}
			 }else{
				if (!sceltaUtentePari) {
					System.out.println("Hai vinto!");
				}else{
					System.out.println("Hai perso!");
				}	
			}
		 }
		
		//chiudo scan
		scan.close();
	}

}
