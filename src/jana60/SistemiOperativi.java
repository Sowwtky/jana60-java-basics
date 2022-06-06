package jana60;

public class SistemiOperativi {

	public static void main(String[] args) {
		//
		int macUsers = 3;
		int windowsUsers = 20;
		int totaleUtenti = macUsers + windowsUsers;
		
		System.out.println("MAC Users: " + macUsers);
		System.out.println("Windows Users: " + windowsUsers);
		System.out.println("Totale: " + totaleUtenti);
		
		double perMac = (double)macUsers * 100 / (double)totaleUtenti;
		double perWindows = (double)windowsUsers * 100 / (double)totaleUtenti;
		
		System.out.println("Percentuale Mac: " + perMac);
		System.out.println("Percentuale Windows " + perWindows);
	}

}
