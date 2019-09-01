package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int countIndex = scan.nextInt();
		
		String[] itemArray = new String[countIndex];
		
		double[] priceArray = new double[countIndex];
		
		int[] countArray = new int[countIndex];
		
		int[] howManyArray = new int[countIndex];
		
		for (int i=0; i < countIndex; i++) {
			itemArray[i] = scan.next();
			priceArray[i] = scan.nextDouble();
		}
		
		// customer info:
		
		int countCustomer = scan.nextInt();
		
		String[] first = new String[countCustomer];
		
		String[] last = new String[countCustomer];
		
		for (int i=0; i < countCustomer; i++) {
			first[i] = scan.next();
			last[i] = scan.next();
			int countProduct = scan.nextInt();
			String[] name = new String[countCustomer];
			
			for (int j=0; j < countProduct; j++) {
				int countUnit = scan.nextInt();
				name[j] = scan.next();
				boolean a = true;
				
				for (int m=0; m < j; m++) {
					if (name[j].equals(name[m])) {
						a = false;
					}
				}
				
				for (int n=0; n < countIndex; n++) {
					if (name[j].equals(itemArray[n]) && a) {
						countArray[n] += 1;
						howManyArray[n] += countUnit;
					} else if (name[j].equals(itemArray[n]) && !a) {
						howManyArray[n] += countUnit;
					}
				}
				
			
			}

		}
		
		for (int i = 0; i < countIndex; i++) {
			if (countArray[i] == 0) {
				System.out.println("No customers bought " + itemArray[i]);
			} else {
				System.out.println(countArray[i] + " customers bought " + itemArray[i]);
			}
		}
		scan.close();
	}
}
