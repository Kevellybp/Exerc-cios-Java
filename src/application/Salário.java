package application;

import java.util.Scanner;

import entities.Funcionario;

public class Sal�rio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Funcionario	funcionario = new Funcionario();
	Scanner sc = new Scanner (System.in);
	System.out.println("Entre com os dados do funcion�rio: ");
	System.out.println("Nome funcion�rio: ");
	funcionario.name =sc.next();
	System.out.println("Sal�rio bruto: ");
	funcionario.salary = sc.nextDouble();
	System.out.println("Imposto: ");
	funcionario.tax = sc.nextDouble();
	System.out.println(funcionario);
	
	System.out.println("Entre com a porcetagem de aumento: ");
	double porcetage = sc.nextDouble();
	funcionario.increaseSalary(porcetage);
	System.out.println("Atualiza��o: " + funcionario);
	}

}
