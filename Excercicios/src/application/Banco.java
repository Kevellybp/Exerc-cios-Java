package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		ContaBancaria conta;
		
		System.out.println("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		System.out.println("Entre com o nome do cliente: ");
		String name = sc.next();
		System.out.println("Deseja entrar com deposito (S/N)?");
		char response = sc.next().charAt(0);
		if (response == 's' || response == 'S') {
			System.out.println("Entre com o valor do deposito:");
			double saldo = sc.nextDouble();
			conta = new ContaBancaria(numConta, name, saldo);
		}
		else {
			conta = new ContaBancaria (numConta, name);
		}
		
		System.out.println();
		System.out.println(conta);
		System.out.println("Entre com o valor do deposito: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.println("Valor atualizado: "+conta);
		System.out.println("Entre com o valor para saque: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Saldo atualizado: " +conta);
		
	}

}
