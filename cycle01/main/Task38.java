package by.htp.cycle01.main;

/* Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. 
 * Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
 */

public class Task38 {

	public static void main(String[] args) {

		int n;
		int n1;
		int m;
		int m1;
		int a;
		int b;
		int b1;

		n = 1357;

		System.out.println(n);

		n1 = 10;
		a = Math.abs(n % 10 - (n / 10) % 10);
		b = 0;
		b1 = 0;

		while (n1 > 9) {

			m = n % 10;

			n1 = n / 10;

			m1 = n1 % 10;

			b = b + 1;

			if (a == Math.abs(m - m1)) {

				b1 = b1 + 1;

			} else if (a != Math.abs(m - m1)) {

				b1 = b1 - 1;

			}

			n = n1;

		}

		if (b == b1) {

			System.out.println("Образует арифметическую прогрессию");

		} else if (b != b1) {

			System.out.println("Необразует арифметическую прогрессию");

		}

	}

}
