package com;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Manager mgr1 = new Manager();
		System.out.println("Please enter manager details");
		//mgr1.readEmp();
		mgr1.readMgr();
		//mgr1.disEmp();
		mgr1.disMgr();
		
		Developer dev1 = new Developer();
		System.out.println("Please enter developer details");
		dev1.readDev();
		dev1.disDev();

	}

}
