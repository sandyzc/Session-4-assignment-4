package com.session5.assignment1;

public class Employee {
	String name;
	int id;
	int basicsalary;
	int hra;
	int da;
	//super class constructor
	public Employee(String name, int id, int basicsalary, int hra, int da, int pf) {
		this.name = name;
		this.id = id;
		this.basicsalary = basicsalary;
		this.hra = hra;
		this.da = da;
		
	}
	//method to calculate the pf of employee
	public double calculatePf(){
		double pf = (basicsalary/100)*18;
		return pf;
	}
// method to calculate salary
	public double calculateSalary(){
		double salary = basicsalary+hra+da-calculatePf();
		return salary;
		
	}

}
