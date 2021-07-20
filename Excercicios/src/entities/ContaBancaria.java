package entities;

public class ContaBancaria {

	private int numConta;
	private String name;
	private double saldo;
	public ContaBancaria(int numConta, String name, double saldo) {
		super();
		this.numConta = numConta;
		this.name = name;
	deposito(saldo);
	}
	
	
	public ContaBancaria(int numConta, String name) {
		super();
		this.numConta = numConta;
		this.name = name;
	}


	public void deposito (double saldoC) {
		saldo += saldoC;
		
	}
	
	public void  saque (double saldo) {
		  this.saldo -= saldo + 5.0;
	}

	
	public int getNumConta() {
		return numConta;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValorConta() {
		return saldo;
	}


	public String toString() {
		return "Conta: " + numConta+ ", nome: " 
				+ name+ ", saldo: "
				+ String.format("%.2f", saldo);
		
	}
}
