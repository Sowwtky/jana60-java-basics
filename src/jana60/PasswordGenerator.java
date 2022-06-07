package jana60;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		/*
		//nome
		String nomeUtente = "Alessia";
		String cognomeUtente = "Biagi";
		//colore preferito
		String colorePreferito = "Lilla";
		//data di nascita
		int giornoNascita = 16;
		int meseNascita = 12;
		int annoNascita = 1999;
		int somma = giornoNascita + meseNascita + annoNascita;
		//password generator
		String password = nomeUtente + "-" + cognomeUtente + "-" + colorePreferito + "-" + somma;
		System.out.println("Password generata: " + password);
		*/
		
		String nome;
		String cognome;
		String colorePreferito;
		int giornoNascita;
		int meseNascita;
		int annoNascita;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci nome:");
		nome = scan.nextLine();
		System.out.println("Hai digitato: " + nome);
		
		System.out.println("Inserisci cognome:");
		cognome = scan.nextLine();
		System.out.println("Hai digitato: " + cognome);
		
		System.out.println("Inserisci colore preferito:");
		colorePreferito = scan.nextLine();
		System.out.println("Hai digitato: " + colorePreferito);
		
		System.out.println("Inserisci giorno di nascita:");
		giornoNascita = scan.nextInt();
		System.out.println("Hai digitato: " + giornoNascita);
		
		System.out.println("Inserisci mese di nascita:");
		meseNascita = scan.nextInt();
		System.out.println("Hai digitato: " + meseNascita);
		
		System.out.println("Inserisci anno di nascita:");
		annoNascita = scan.nextInt();
		System.out.println("Hai digitato: " + annoNascita);
		
		int somma = giornoNascita + meseNascita + annoNascita;
		String password = nome + "-" + cognome + "-" + colorePreferito + "-" + somma;
		
		System.out.println("La tua password é: " + password);
		scan.close();
	}

}
