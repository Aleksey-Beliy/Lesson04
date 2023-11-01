package edu.academy.it.lesson04;

public class Main10 {

	public static void main(String[] args) {

		double x1 = 3;
		double y1 = 4;
		double x2 = 3;
		double y2 = 5;

		double a1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		double a2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

		if (a1 == a2) {
			System.out.println("Точки А и В равноудалены от начала координат");
		}
		else {
		if (a1 < a2) {
			System.out.println("Точка А ближе к началу координат");
		} else {
			System.out.println("Точка В ближе к началу координат");
		}
	
		}}
	}


