package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.88;
		double ES = 27165.48;
		double outros = 19849.53;
		
		double total = SP + RJ + MG + ES + outros;
		
		System.out.println("total: " + total);
		
		SP = (SP * 100) / total;
		RJ = (RJ * 100) / total;
		MG = (MG * 100) / total;
		ES = (ES * 100) / total;
		outros = (outros * 100) / total;
		
		System.out.println("Prcentagem: " + String.format("%.2f", SP ) + "%");
		System.out.println("Prcentagem: " + String.format("%.2f", RJ ) + "%");
		System.out.println("Prcentagem: " + String.format("%.2f", MG ) + "%");
		System.out.println("Prcentagem: " + String.format("%.2f", ES ) + "%");
		System.out.println("Prcentagem: " + String.format("%.2f", outros ) + "%");
		
		sc.close();

	}

}
