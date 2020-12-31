package by.htp.cycle01.main;

/* В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, 
 * то получили исходное число. Найти это число.
 */

public class Task39 {

	public static void main(String[] args) {

		int n;
		int n1;
		int m;

		for (n = 100; n <= 999; ) {

			m = n / 100;

			n1 = (n - m * 100) * 7;
			
			if(n == n1) {
				
				System.out.println(n);
				
			}
			
			n++;

		}
		
	}

}
