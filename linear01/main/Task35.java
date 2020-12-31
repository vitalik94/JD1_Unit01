package by.htp.linear01.main;

/* Даны натуральные числа M и N.
 * Вывести старшую цифру дробной части и младшую цифру целой части числа M/N
 */

public class Task35 {
	
	public static void main(String[] args) {
		 
		double M = 1234;
		double N = 12;
		double z;
		int x;
		int y;
		
		z = M / N ;
		
		System.out.println("z = " + z);
		
		x = (int) (M / N) % 10;
			
		System.out.println("x = " + x);
		
		y = (int)((z - (int)(M / N)) * 10) ;
		
		System.out.println("y = " + y);
		
	}

}
