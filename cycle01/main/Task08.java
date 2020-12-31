package by.htp.cycle01.main;

/* Вычислить значения функции на отрезке [а,b] c шагом h
 * y = (x + c) * 2 , x = 15
 * y = (x - c) + 6 , x ≠ 15
 */

public class Task08 {
	
	public static void main(String[] args) {
		
		int a = 0;
		int b = 20;
		int h = 1;
		int c = 1;
		int x;
		int y;
		
		x = a;
		
		while(x < b) {
			
		    if(x!=15) {
			
			y = (x - c) + 6;
			
			System.out.println("x = " + x + "," + "y = " + y);
			
			x = x + h;
		   
		   }else if(x == 15 ) {
				
		    	y = (x + c) * 2;
		    	
		    	System.out.println("x = " + x + "," + "y = " + y);
			
			    x = x + h;
			}
		
		}
		
	}

}
