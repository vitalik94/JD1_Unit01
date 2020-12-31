package by.htp.branching01.main;

/* Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, 
 * которая из точек находится ближе к началу координат.
 */

public class Task13 {
	
    public static void main(String[] args) {
    	
    	double A;
    	double B;
    	int x1 = 1;
    	int y1 = 2;
    	int x2 = 3;
    	int y2 = 4;
    	
    	A = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
    	B = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
    	
    	if(A > B){
    		
    		System.out.println("точка B ближе к началу координат");
    		
    	}else if(A < B) {
    		
    		System.out.println("точка A ближе к началу координат");
    		
    	}else {
    		
    		System.out.println("точка A и точка B равны");
    		
    	}
    	
    }

}
