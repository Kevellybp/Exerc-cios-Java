package application;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
	Triangle x, y;
	x= new Triangle();
	y= new Triangle ();
	System.out.println("Entre com a �rea do tri�ngulo X");
		x.a= sc.nextDouble();
		x.b= sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com a �rea do tri�ngulo:");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.printf("A �rea do tri�ngulo X: %.4f%n", areaX);
		System.out.printf("A �rea do tri�ngulo y %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior �rea � a X");
			
		}
		else {
			System.out.println("A maior � a �rea Y");
		}
	}

}
