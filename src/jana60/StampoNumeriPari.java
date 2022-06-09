package jana60;

public class StampoNumeriPari {

	public static void main(String[] args) {
		//Per i primi 100 numeri naturali stampa solo i numeri pari
		
		for (int i = 0; i <= 100; i++) {
			if ((i % 2) == 0) {
				System.out.println(i);
			}
		}

	}

}
