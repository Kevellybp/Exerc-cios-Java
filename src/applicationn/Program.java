package applicationn;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	double [] vect = new double [n];
	for (int i=0; i<n; i++ ) {
		vect [i] = sc.nextDouble();
	}
	
	double sum =0;
	for (int i =0; i<n; i++) {
		sum += vect [i];
		
	}
	double media = sum / n;
	
	System.out.printf("A média é : %.2f%n" , media);
	
	}
}
