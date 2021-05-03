package demenagement;

public class demenagement {
	public static void main(String[] args) {
		int totalDeCartons = 34;
		int cartonsMaxParVoyage = 9;
			while (totalDeCartons >= cartonsMaxParVoyage) {
			 	System.out.println("Un voyage de 9 cartons");
			 	totalDeCartons = totalDeCartons - cartonsMaxParVoyage;
			 	if (totalDeCartons<cartonsMaxParVoyage) {
			 		System.out.println("Un voyage de " + totalDeCartons + " cartons");
			 	}
		}
	}
}