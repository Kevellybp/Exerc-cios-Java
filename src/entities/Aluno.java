package entities;

public class Aluno {
public String nome;
public double semestre1;
public double semestre2;
public double semestre3;


public double notaFinal() {
	return semestre1 +semestre2 +semestre3;
}
public double situação() {
	if (notaFinal() < 60.0) {
		return 60.0 - notaFinal();
		
	}
	else {
		return 0.0;
	}
}
}
