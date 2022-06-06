package jana60;

public class BookStore {

	public static void main(String[] args) {
		//titolo
		String titolo = "9 algoritmi che hanno cambiato il futuro";
		//formato
		boolean copertinaFlessibile = true;
		boolean kindle = true;
		//data pubblicazione
		short giornoPubblicazione = 1;
		short mesePubblicazione = 11;
		int annoPubblicazione = 2012;
		//autore
		String autore = "John McCormick";
		//rating
		double rating = 4.3;
		int numeroVoti = 23;
		//prezzo
		double prezzoConsigliato = 18.00;
		double prezzoFinale = 17.10;
		double sconto = 0.05;
		//dimensioni
		float altezza = 21.0f;
		float larghezza = 13.7f;
		float spessore = 1.7f;
		String etichetta = "Dimensioni"; 
		System.out.println(etichetta + ": " + altezza + " " + larghezza + " " + spessore);
	}

}
