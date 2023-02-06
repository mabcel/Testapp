package com;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Pulsar extends Bike {            // Overriding the method
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Red");
	}
}
class Honda extends Bike {             //Re-usability of the method
	void color() {
		System.out.println("Gray");
	}
}
class Tvs extends Bike {
	void color() {
		System.out.println("Black");
	}
	@Override
	void speed() {
		super.speed();                  //calling super class speed method
		System.out.println("20km/hr");  // super class and sub class code merge together
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Pulsar pu = new Pulsar();     pu.color();   pu.speed();
		Honda hh = new Honda();       hh.color();   hh.speed();
        Tvs tv = new Tvs();           tv.color();   tv.speed(); 
	}

}
