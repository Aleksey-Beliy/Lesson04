package edu.academy.it.lesson04;

public class Main14 {

	public static void main(String[] args) {

		int m = 9;
		int n = 8;

		if (n == m) {
			m = 0;
			n = 0;
			System.out.println("n = " + n);
			System.out.println("m = " + m);
		}

		if (n != m) {
			if (n > m) {
				m = n;
				System.out.println("n = " +m);
				System.out.println("n = " +n);
			}
			else {
				n = m;
				System.out.println("n = " +m);
				System.out.println("n = " +n);
			}
			

				
			

		}
	}
}
