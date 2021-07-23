package application;

import java.util.Scanner;

import entities.ProductVetores;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ProductVetores[] vect = new ProductVetores[n];
		
for (int i=0; i<vect.length; i++) {
	sc.nextLine();
	
	String name = sc.nextLine();
 double price = sc.nextDouble();
 
 vect[i] = new ProductVetores(name, price);
}

 double sum = 0;
 for (int i=0; i<vect.length; i++) {
	sum += vect[i].getPrice();
 }
 double media = sum / vect.length;
 System.out.printf("A soma dos preços é: %.2f%n", media);

	}

}
