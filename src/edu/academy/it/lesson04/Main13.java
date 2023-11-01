package edu.academy.it.lesson04;

public class Main13 {

	public static void main(String[] args) {

		int x1 = 5;
		int y1 = -5;

		if ((x1 > 0) & (y1 > 0)) {
			System.out.println("Точка А расположена в первом координатном углу");
		}
		if ((x1 > 0) & (y1 < 0)) {
			System.out.println("Точка А расположена в четвёртом координатном углу");
		}
		if ((x1 < 0) & (y1 > 0)) {
			System.out.println("Точка А расположена в втором координатном углу");
		}
		if ((x1 < 0) & (y1 < 0)) {
			System.out.println("Точка А расположена в третьем координатном углу");
		}
	}
}
