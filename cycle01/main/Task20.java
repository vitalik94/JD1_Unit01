package by.htp.cycle01.main;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
 * 
 * an = 1 / ((3 * n - 2) * (3 * n + 1))
 * 
 */

public class Task20 {

	public static void main(String[] args) {
		
		double an;
		double n;
		double e = 0.1;
		double s = 0;
		
		for(n = 0;n < 10; ) {
			
			an = Math.abs(1 / ((3 * n - 2) * (3 * n + 1)));
			
			n++;
			
			if(an >= e) {
				
				System.out.println(an);
				
				s = s + an;
				
			}
			
		}
		System.out.println(s);
	}

}
