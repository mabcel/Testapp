package com;
class Info {
	int a ;
	static int b;
	void dis() {
		System.out.println("a "+b);
		System.out.println("b "+b);
	}
}
public class StaticAnotherExample {

	public static void main(String[] args) {
		Info obj1 = new Info();               //heap memory
		Info obj2 = new Info();
		obj1.a=100;
		Info.b=200;
		obj1.b=300;
		
		obj2.a=400;
		Info.b=500;
		obj2.b=600;
		obj1.dis();
		obj2.dis();
		

	}

}
