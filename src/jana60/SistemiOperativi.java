package jana60;

public class SistemiOperativi {

	public static void main(String[] args) {
		//
		double macUsers = 3;
		double windowsUsers = 20;
		double totaleUtenti = macUsers + windowsUsers;
		
		System.out.println("MAC Users: " + macUsers);
		System.out.println("Windows Users: " + windowsUsers);
		System.out.println("Totale: " + totaleUtenti);
		
		double perMac = macUsers * 100 / totaleUtenti;
		double perWindows = windowsUsers * 100 / totaleUtenti;
		
		System.out.println("Percentuale Mac: " + perMac);
		System.out.println("Percentuale Windows " + perWindows);
	}

}
