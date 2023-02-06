package com;

public class Employee {
	int id;
	String name;
	float salary;
	// Empty constructor
	public Employee() {
		id = 123;
		name = "Unkown";
		salary =8000;
	}
	//parameter constructor
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary; 
	}
	
//	void setEmpInfo (int id1, String name1, float salary1) {
//		id = id1;
//		name = name1;
//		salary=salary1;
//		
//	}
	
	void setEmpInfo (int id, String name, float salary) {
		this.id = id;     //left side is instance and right side is local
		this.name = name;
		this.salary=salary;
		
	}
	void calSalary() {
		float bonus =5000;
		salary = salary+bonus;
	}
	void displayEmpInfo() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}

}
