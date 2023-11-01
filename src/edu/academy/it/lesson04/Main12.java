package edu.academy.it.lesson04;

public class Main12 {

	public static void main(String[] args) {

		double x = 56;
		double y = 63;

		if (x < y) {
			 x = (x + y) / 2;
		} else {
			 y = (x + y) / 2;
		}
		if (x > y) {
			 x = (x * y) * 2;
		}
		else {
			 y = (x * y) * 2;
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
