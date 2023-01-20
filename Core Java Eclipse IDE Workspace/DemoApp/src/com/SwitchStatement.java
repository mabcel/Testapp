package com;

public class SwitchStatement {

	public static void main(String[] args) {
		int choice = 5;
		switch (choice) {
		case 1:System.out.println("Block 1");
		        break;
		case 2:System.out.println("Block 2");
                break;
		case 3:System.out.println("Block 3");
                break;
		default:System.out.println("Wrong Block");
                break;  // Optional. You can ignore the break after the default block.
		}
        System.out.println("Finish");
	}

}
