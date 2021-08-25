package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private String level;
	private Double baseSalary;
	
	private Departament departament;
	private List<HourContract> contracts = new ArrayList <> ();
	
	private Worker () {
		
	}

	public Worker(String name, String level, Double baseSalary, Departament departament) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}


	public void addContract (HourContract contract) {
contracts.add(contract);
	
	}
	public void remoteContract (HourContract contract) {
		contracts.remove(contract);
	}
	public Double income (int year, int month) {
		double sum = baseSalary;
	
		Calendar cal = Calendar.getInstance();
		for (HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
					int c_month =1+  cal.get(Calendar.MONTH);
			if (year == c_year || month == c_month) {
				sum += c.totalValue();
			}
			
		}
		return sum;
	}
	
	
}
