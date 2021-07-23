package application;

import java.util.Scanner;

import entities.Estudantes;

public class Quartos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);


Estudantes [] est= new Estudantes[10];
System.out.println("Quantos quartos serão alugados?");
int n = sc.nextInt();

for (int i=0;i<=10; i++) {
	System.out.println();
	System.out.println("Rent: "+ i +":");
	System.out.println("Entre com o nome:");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.println("Entre com o email: ");
	String email = sc.nextLine();
	System.out.println("Quantidade de quartos: ");
	int quartos = sc.nextInt();
	est[quartos] = new Estudantes (name, email);
	
}

System.out.println();
System.out.println("Quartos ocupados:");
for (int i=0; i<10; i++) {
	if (est[i] != null) {
		System.out.println(i + ":"+ est[i]);
	}
}
	}

}
