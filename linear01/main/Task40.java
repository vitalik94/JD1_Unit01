package by.htp.linear01.main;

/* Дано значение х. Получить значения  -2х + 3х^2 - 4х^3  и 1 + 2х + 3х^2 + 4х^3 . 
 * Позаботьтесь об экономии операций. 
 */

public class Task40 {
	
	public static void main(String[] args) {
		
		int x;
		int m;
		int n;
		
		x = 2;
		
		m = x * ( - 2 + x * ( 3  - 4 * x ));
		n = 1 + x * ( 2 + x * ( 3 + 4 * x ));
		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
		
	}

}
