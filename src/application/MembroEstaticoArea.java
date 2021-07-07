package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class MembroEstaticoArea {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();

		double c = Calculator.cirncumference(raio);
		double v = Calculator.volume(raio);
		System.out.printf("Circunferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", Calculator.PI);

	}


}
