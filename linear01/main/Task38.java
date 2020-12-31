package by.htp.linear01.main;

/* Для данных областей составить линейную программу, которая печатает  true,
 * если точка с координатами  (х, у)принадлежит закрашенной области,
 * и false — в противном случае:  
 */
 
public class Task38 {
	
	public static void main(String[] arg) {
		
		boolean t = true;
		boolean f = false;
		
		int x;
		int y;
		
		
		x = 1;
		y = 2;
		
		
		if( y <= 4 - x && y <= 4 + x && y >= 0 ) {
			
			System.out.println("a) " + "x = " + x + ", " + "y = " + y);
			System.out.println("   " + t);
			System.out.println("   " + "точка в закрашенной области");
			
		}else {
			
			System.out.println("a) " + "x = " + x + ", " + "y = " + y);
			System.out.println("   " + f);
			System.out.println("   " + "точка в незакрашенной области");
			
		}
		
		
		if(x <= 2 & x >= -2 & y <= 4 & y >= 0){
			
			System.out.println("b) " + "x = " + x + ", " + "y = " + y);
			System.out.println("   " + t);
			System.out.println("   " + "точка в закрашенной области");
			
		}else if(x >= -4 & x <= 4 & y >= -3 & y <= 0){
			
			System.out.println("b) " + "x = " + x + ", " + "y = " + y);
			System.out.println("   " + t);
			System.out.println("   " + "точка в закрашенной области");
			
		}else{
			
			System.out.println("b) " + "x = " + x + ", " + "y = " + y);
			System.out.println("   " + f);
			System.out.println("   " + "точка в незакрашенной области");
			
		}
		
        if(x >= 0 & y >= 0 & ((x*x + y*y) <= 16)){
			
			System.out.println("c) " + "x = " + x + ", " + "y = " + y);
			System.out.println("   " + t);
			System.out.println("   " + "точка в закрашенной области");
			
		}else if(x >= 0 & y <= 0 & ((x*x + y*y) <= 25)){
			
			System.out.println("c) " + "x = " + x + ", " + "y = " + y);
			System.out.println("   " + t);
			System.out.println("   " + "точка в закрашенной области");
			
		}else{
			
			System.out.println("c) " + "x = " + x + ", " + "y = " + y);
			System.out.println("   " + f);
			System.out.println("   " + "точка в незакрашенной области");
			
		}
		
	}
	
}
