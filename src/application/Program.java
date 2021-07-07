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
	System.out.println("Entre com a área do triângulo X");
		x.a= sc.nextDouble();
		x.b= sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com a área do triângulo:");
		y.a= sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		
		System.out.printf("A área do triângulo X: %.4f%n", areaX);
		System.out.printf("A área do triângulo y %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior área é a X");
			
		}
		else {
			System.out.println("A maior é a área Y");
		}
	}

}
