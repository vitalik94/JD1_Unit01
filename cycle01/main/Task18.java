package by.htp.cycle01.main;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или 
 * равен заданному е. Общий член ряда имеет вид: 
 * 
 * an = ((-1)^(n-1))/n
 */

public class Task18 {

	public static void main(String[] args) {

		double a;
		int n;
		double e = 0.1;
		double s = 0;

		for (n = 20;n>0;) {

			a = Math.abs(Math.pow(-1, n - 1) / n);
			n--;

			if (a >= e) {
				System.out.println(n);
				s = s + a;
			}
			
		}
		System.out.println(s);
	}

}
