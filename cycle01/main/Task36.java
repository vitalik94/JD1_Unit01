package by.htp.cycle01.main;

/* Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, 
 * которое делится на их произведение. Найти эти числа.
 */

public class Task36 {

	public static void main(String[] args) {

		int x;
		int y;
		int z;

		for (x = 10; x <= 99;) {

			for (y = 1; y <= 99;) {

				z = x * 100 + y;

				if (z % (x * y) == 0) {

					System.out.println("x = " + x + "; y = " + y);

				}

				y++;

			}

			x++;

		}

	}

}
