package com;

public class Manager extends Employee{
	private int numberOfEmp;
	Address add = new Address();
	void readMgr() {
		readEmp();
		System.out.println("Enter the number of employees working under him");
		numberOfEmp = sc.nextInt();
		add.readAdd();
		}
	
	void disMgr() {
		disEmp();
		System.out.println("Number of employees working under him is "+numberOfEmp);
		add.disAdd();
	}

}
