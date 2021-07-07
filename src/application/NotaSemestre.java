package application;

import java.util.Scanner;

import entities.Aluno;

public class NotaSemestre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aluno aluno = new Aluno();
Scanner sc = new Scanner (System.in);
System.out.println("Nome do aluno: ");
aluno.nome = sc.next();
System.out.println("Entre com a nota do primeiro semestre: ");
aluno.semestre1 = sc.nextDouble();
System.out.println("Entre com a nota do segundo semestre: ");
aluno.semestre2 = sc.nextDouble();
System.out.println("Entre com a nota do terceiro semestre: ");
aluno.semestre3 = sc.nextDouble();

System.out.printf("Nota final: %.2f%n", aluno.notaFinal());

if (aluno.notaFinal() < 60.0) {
	System.out.println("Reprovado!");
	System.out.printf("Para a obtenção da média final, o aluno precisa de: %.2f pontos" , aluno.situação());
}
else  {
	System.out.println("Aprovado");
}
	}

}
