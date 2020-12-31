package by.htp.branching01.main;

/* Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да,то будет ли он прямоугольным
 */

public class Task14 {
	
	public static void main(String[] args) {
		
		int a = 30;
		int b = 90;
		int c;
		
		c = a + b;
		
		if(c < 180 && a == 90 | b == 90) {
			
			System.out.println("треугольник существут и треугольник прямоугольный");
	
		}else if(c < 180) {
			
			System.out.println("треугольник существут");
			
		}else {
			
			System.out.println("треугольник несуществут");
			}
			
	}

}
