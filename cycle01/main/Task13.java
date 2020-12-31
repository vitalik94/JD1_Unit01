package by.htp.cycle01.main;

// Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5

public class Task13 {
	
	public static void main(String[] args) {
		
		int a = -5;
		int b = 5;
		double h = 0.5;
		double x;
		double y;
		
		x = a;
		
		while (x <= b) {
			
			y = 5 - Math.pow(x, 2) / 2;
			
			System.out.println("x = " + x + "," + "y = " + y);
			
			 x = x + h;
			
		}
		
	}

}
