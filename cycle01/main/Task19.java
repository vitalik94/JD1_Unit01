package by.htp.cycle01.main;

/* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
 * 
 *  an =(1/2n) + (1/3n)
 *  
 */

public class Task19 {
	
	public static void main(String[] args) {
		
		double an;
		double e = 0.2;
		int n;
		double s = 0;
		
		for(n = 20;n >= 0; ) {
			
			an = Math.abs(1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
			
			n--;
			
			if(an>=e) {
				
				System.out.println(n);
				
				s = s + an;
				
			}
			
		}
		System.out.println(s);
	}

}
