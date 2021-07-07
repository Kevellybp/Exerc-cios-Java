package entities;

public class Funcionario {
public String name;
public double salary;
public double tax;

public double netSalary() {
	 return salary- tax;
}
public void increaseSalary (double porcetage) {
	salary += salary * porcetage /100.0;
}
public String toString () {
	return name + ", R$" 
			+ String.format("%.2f", netSalary());
}

}
