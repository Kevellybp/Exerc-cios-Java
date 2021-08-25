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
		System.out.println("Inicio do m�todo");
		method2();
		System.out.println("Fim do m�todo");
	}

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("**Incio m�todo 2**");
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("posi��o inv�lida");
			e.printStackTrace(); // imprimir o rastreamento do stack
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("**fim m�todo 2**");
	}
}
