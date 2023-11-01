package edu.academy.it.lesson04;

public class Main11 {

	public static void main(String[] args) {

		int a = 34;
		int b = 90;

		if (a + b < 180) {
			System.out.println("Этот треугольник существует");
		} else {
			System.out.println("Этого треугольника не существует");
		}
		int c = 180 - a - b;
		if (a == 90 || b == 90 || c == 90) {
			System.out.println("Этот треугольник является прямоугольным");
		}
	}

}
