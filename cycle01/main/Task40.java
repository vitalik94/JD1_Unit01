package by.htp.cycle01.main;

/* Получить все числа, не превышающие заданного числа N, 
 * которые делятся без остатка на все свои цифры.
 */

public class Task40 {

	public static void main(String[] args) {

		int n;
		int n1;
		int m;
		int a;
		int b;

		for (n = 1; n <= 10;) {
			
			a = 0;
			b = 0;

			n1 = n;

			while (n1 != 0) {

				m = n1 % 10;
				
				a = a + 1;

				if (m == 0) {

					break;

				} else if (n % m == 0) {
					
					b = b + 1;

				}

				n1 = (n1 - m) / 10;

			}
			
			if(a == b) {
				
				System.out.println(n);
				
			}

			n++;

		}

	}

}
