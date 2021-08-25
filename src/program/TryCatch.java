package program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		method1();
	}

	public static void method1() {
		System.out.println("Inicio do método");
		method2();
		System.out.println("Fim do método");
	}

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**Incio método 2**");
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("posição inválida");
			e.printStackTrace(); // imprimir o rastreamento do stack
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("**fim método 2**");
	}
}
