package by.htp.cycle01.main;

/* Составить программу для вычисления значений функции  F(x) на отрезке [а, b] с шагом h. 
 * Результат представить в виде таблицы, первый столбец которой – значения  аргумента, 
 * второй - соответствующие значения функции: 
 * 
 * F(x) = ctg( x / 3 ) + ( 1 / 2 ) * sin( x )
 * 
 */

public class Task23 {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 10;
		double h = 0.5;
		double x;
		double y;
		
		x = a;
		
		System.out.println("|  " + "F(x)" + " |   " + "x" + "  |");
		System.out.println(" --------------");
		
		while(x <= b) {
			
			y = Math.atan(x / 3) + (1 / 2) * Math.sin(x); 

			System.out.print("| ");
			System.out.printf("%5.2f", y );
			System.out.print(" | ");
			System.out.printf("%4.1f",x);
			System.out.print(" |");
			System.out.println();
			System.out.println(" --------------");
			
			x = x + h;
			
		}
		
	}

}
