package edu.academy.it.lesson04;

public class Main08 {

	public static void main(String[] args) {

		int a1 = 4;
		int a2 = 7;
		int h1 = 3;
		int h2 = 2;
		
		int s1 = (1/2)*a1 * h1;
		int s2 = (1/2)*a2 * h2;

		if(s1>s2) {
			System.out.println("Площадь первого треугольника больше");
		}
		else {
			System.out.println("Площадь второго треугольника больше");

		}
	}

}
