package by.htp.cycle01.main;

import java.util.Scanner;

/* Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. 
 * Человек пытается их угадать.  Программа  должна  выводить  угаданные  и
 * неугаданные  числа  из  тех,  что  сгенерировала программа, 
 * а также ошибочные числа пользователя. 
 */

public class Task31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int m;
		int a;

		a = 1;

		System.out.println("Введите пять чисел от 1 до 15:");

		while (a <= 5) {

			n = (int) (1 + Math.random() * 15);

			m = sc.nextInt();

			if (n == m & m > 0 & m <= 15) {

				System.out.println("n = " + n + "; m = " + m);
				System.out.println("Вы угадали число");

			} else if (n != m & m > 0 & m <= 15) {

				System.out.println("n = " + n + "; m = " + m);
				System.out.println("Вы неугадали число");

			} else if (m < 1 | m > 15) {

				System.out.println("Введено неверное число");

				a = a - 1;

			}

			a = a + 1;

		}

	}

}
