package com.session5.assignment1;

public class Main{
	public static void main(String[] args) {
		
	//object created of subclass 
	Manager emp = new Manager("santosh", 12, 20000, 2000, 5000, 2000,12000,true);
	System.out.println("The name of the employee is "+emp.name);
	System.out.println("The id of the employee is "+emp.id);
	System.out.println("The Basic salary of the employee is "+emp.basicsalary);
	System.out.println("The HRA of the employee is "+emp.hra);
	System.out.println("The DA of the employee is "+emp.da);
	System.out.println("The pf deducted is is "+emp.calculatePf());
	System.out.println("The project allowence is "+emp.projectallowance);
	System.out.println("The Project compleation status  is "+emp.projectcompleated);
	System.out.println("the total salary is "+emp.calculateSalary());
	}

}
