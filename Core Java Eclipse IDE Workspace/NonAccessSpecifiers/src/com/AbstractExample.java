package com;

abstract class Bike {
	abstract void speed();
}
abstract class Pulsar extends Bike {            
	abstract void mileage();
	void color() {
		System.out.println("Red");
	}
}
class SuperPulsar extends Pulsar{
	void speed() {
		System.out.println("120km/hr");
	}
	void mileage() {
		System.out.println("20km/lt")
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		
//Pulsar pu = new Pulsar();
		SuperPulsar sp = new SuperPulsar();
		sp.color();
		sp.mileage();
		sp.speed();
	}

}
