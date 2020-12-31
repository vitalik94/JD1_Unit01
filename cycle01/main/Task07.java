package by.htp.cycle01.main;

/*Вычислить значения функции на отрезке [а,b] c шагом h
 * y = x, x > 2
 * y = -x, x <= 2
 */

public class Task07 {
	
	public static void main(String[] args) {
		
		int a = -5;
		int b = 5;
		int h = 1;
		int x;
		int y;
		
		x = a;
		
		while(x<=2) {
			
		    	y = (- x);
		    	
		    	System.out.println("x = " + x + "," + "y = " + y);
			
			    x = x + h;
			
		    }
		 
		
		while(x>2 & x<b) {
			
			y = x;
			
			System.out.println("x = " + x + "," + "y = " + y);
			
			x = x + h;
			
		}
	
  	}
}
