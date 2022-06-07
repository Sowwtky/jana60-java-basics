package jana60;

public class PasswordGenerator {

	public static void main(String[] args) {
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
		
	}

}
