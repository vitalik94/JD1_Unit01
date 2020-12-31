package by.htp.linear01.main;

/* Вести любой символ и определить его порядковый номер,
 * а также указать предыдущий и последущий символы
 */

public class Task33 {
	
	public static void main(String[] args) {
		
		char ch = 'a';
		int x = (int) ch;
		
		char ch1 = (char)(x - 1);
		char ch2 = (char)(x + 1);
		
		System.out.println("'a' = " + x);
		System.out.println("ch1 = " + ch1 + "," + "ch2 = " + ch2);
	}

}
