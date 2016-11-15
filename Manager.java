package com.session5.assignment1;

public class Manager extends Employee{
	//superclass constructor chained with child class construcor called
	public Manager(String name, int id, int basicsalary, int hra, int da, int pf, int projectallowance,
			boolean projectcompleated) {
		//super call initiation
		super(name, id, basicsalary, hra, da, pf);
		this.projectallowance = projectallowance;
		this.projectcompleated = projectcompleated;
	}
	
	int projectallowance;
	boolean projectcompleated;
	
	@Override
	public double calculateSalary() {
		if(projectcompleated){
			return super.calculateSalary()+projectallowance;
		}
		else{
			return super.calculateSalary();	
		}
		
	}
	}
	

