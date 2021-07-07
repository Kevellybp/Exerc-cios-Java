package application;

import java.util.Scanner;

import entities.Funcionario;

public class Salário {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Funcionario	funcionario = new Funcionario();
	Scanner sc = new Scanner (System.in);
	System.out.println("Entre com os dados do funcionário: ");
	System.out.println("Nome funcionário: ");
	funcionario.name =sc.next();
	System.out.println("Salário bruto: ");
	funcionario.salary = sc.nextDouble();
	System.out.println("Imposto: ");
	funcionario.tax = sc.nextDouble();
	System.out.println(funcionario);
	
	System.out.println("Entre com a porcetagem de aumento: ");
	double porcetage = sc.nextDouble();
	funcionario.increaseSalary(porcetage);
	System.out.println("Atualização: " + funcionario);
	}

}
