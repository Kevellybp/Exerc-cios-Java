package application;

import java.util.Scanner;

import entities.Product;

public class Dinheiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner (System.in);
	
		
	Product product = new Product();
	System.out.println("Entre com os dados do produto: ");
	System.out.println("nome: ");
	product.name = sc.next();
	System.out.println("valor: ");
	product.price = sc.nextDouble();
	System.out.println("Quantidade no estoque: ");
	product.quantity = sc.nextInt();
	
	System.out.println("Dados do produto: "+ product);
	System.out.println();
	System.out.println("Entre com a quantidade de produto a ser adicionada ao estoque:  ");
	int quantity = sc.nextInt();
	product.addProducts(quantity);
	System.out.println("Atualização: "+ product);
	System.out.println();
	System.out.println("Entre com a quantidade a ser removida do estoque: ");
	 quantity = sc.nextInt();
	product.removeProducts(quantity);
	System.out.println("Atualização "+ product);
	}

}
