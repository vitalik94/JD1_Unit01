package by.htp.linear01.main;

/* Дана величина A, выражающая обьем информации в байтах.
 * Перевести A в более крупные единицы измерения информации 
 */

public class Task34 {
	
	public static void main(String[] args) {
		
		double A = 1234;
		double A1;
		double A2;
		double A3;
		double A4;
		
		A1 = A / 1024;
		System.out.println(A1 + "Кбайт");
		A2 = A1 / 1024;
		System.out.println(A2 + "Мбайт");
		A3 = A2 / 1024;
		System.out.println(A3 + "Гбайт");
		A4 = A3 / 1024;
		System.out.println(A4 + "Тбайт");
	}
	

}
