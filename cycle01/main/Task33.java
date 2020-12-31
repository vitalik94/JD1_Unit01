package by.htp.cycle01.main;

// Найдите наибольшую цифру данного натурального числа.

public class Task33 {

	public static void main(String[] args) {

		int n;
		int m;
		int b;

		n = 1234;
		System.out.println("n = " + n);
		b = 0;

		while (n != 0) {

			m = n % 10;

			if (m > b) {

				b = m;

			}

			n = (n - m) / 10;

		}
		
		System.out.println("b = " + b);

	}

}
