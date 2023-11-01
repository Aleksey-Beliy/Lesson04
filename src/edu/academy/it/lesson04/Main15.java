package edu.academy.it.lesson04;

public class Main15 {

	public static void main(String[] args) {

		int a = 3;
		int b = -10;
		int c = -7;
		int count = 0;
		int count2 = 0;
		if(a<0){
		count++;
		}
		else {
			count2++;
		}
		if(b<0){
			count++;
		}
		else {
			count2++;
		}
		if(c<0){
			count++;
		}
		else {
			count2++;
		}
		System.out.println("Количество отрицательных чисел = " + count);
		System.out.println("Количество положительных чисел = " + count2);
	}

}
