package com;

public class ArrayMemory {

	public static void main(String[] args) {
		int num[] =new int[10];   // num can hold 10 values from 0 to 9
		int temp=100;
		System.out.println("Assign the value ");
		for (int i=0;i<num.length;i++ ) {  // iteration to store values
			num[i]=temp++;
		}
		System.out.println("Display the value");
		for (int n:num) {                     // iteration to display values
			System.out.println(n);
		}
	}

}
