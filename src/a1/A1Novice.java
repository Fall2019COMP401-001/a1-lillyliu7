package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		
		for (int i=0; i<count; i++) {
			String first = scan.next();
			String last = scan.next();
			int noOfItem = scan.nextInt();
			double priceTotal = 0;
			String priceTotalFinal = "";
			for (int j=0; j<noOfItem; j++) {
				int howMany = scan.nextInt();
				String name = scan.next();
				double price = scan.nextDouble();
				priceTotal += price * howMany;
				priceTotalFinal = String.format("%.2f", priceTotal);
			}
			char firstLetter = first.charAt(0);
			System.out.println(firstLetter + ". " + last + ": " + priceTotalFinal);
			
		}
		
		
		scan.close();
		
	}
}
