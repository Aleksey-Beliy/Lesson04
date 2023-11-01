package edu.academy.it.lesson04;

public class Main06 {

	public static void main(String[] args) {

		int a = 4;
		int b = 5;
		int c = 5;
		
		if((a == b) & (b == c) & (a == c)){
			System.out.println("Треугольник равносторонний");
		}
		else {
			System.out.println("Треугольник не равносторонний");
		}
	}

}
