package by.htp.cycle01.main;

import java.util.Scanner;

/* Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). 
 * Вычислить результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный 
 * знак операции, а также  на  ввод  Y = 0  при  делении.  Организовать  возможность  многократных 
 * вычислений  без перезагрузки программа (т.е. построить цикл). 
 * В качестве символа прекращения вычислений принять ‘0’. 
 */

public class Task28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		int x;
		int y;

		int z;

		while (ch != '0') {

			char ch1 = sc.next().charAt(0);

			if (ch1 == '+') {

				System.out.print("> ");
				x = sc.nextInt();

				System.out.print("> ");
				y = sc.nextInt();

				z = x + y;

				System.out.println(z);

			} else if (ch1 == '-') {

				System.out.print("> ");
				x = sc.nextInt();

				System.out.print("> ");
				y = sc.nextInt();

				z = x - y;

				System.out.println(z);

			} else if (ch1 == '*') {

				System.out.print("> ");
				x = sc.nextInt();

				System.out.print("> ");
				y = sc.nextInt();

				z = x * y;

				System.out.println(z);

			} else if (ch1 == '/') {

				System.out.print("> ");
				x = sc.nextInt();

				System.out.print("> ");
				y = sc.nextInt();

				if (y == 0) {

					System.out.println("Неверное число");

				}

				z = x / y;

				System.out.println(z);

			} else if (ch1 == '0') {

				break;

			} else if (ch1 != '+' & ch1 != '-' & ch1 != '*' & ch1 != '/') {

				System.out.println("Неверный символ");

			}

			ch = ch1;

		}

	}

}
