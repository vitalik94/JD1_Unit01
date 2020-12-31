package by.htp.linear01.main;

/* Дано значение a. Неиспользуя никаких функций и никаких операций, кроме умножения, 
 * получить значение a^8 за три операции и a^10 за четыре операции  
*/

public class Task27 {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b;
		int c;
		int d;
		int e;
		
		b = a * a;
		c = b * b;
		d = c * c;
		e = d * b;
		
		System.out.println("d = " + d +"," + "e = " + e);
		
	}

}
