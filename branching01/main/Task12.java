package by.htp.branching01.main;

/* Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны,
 * и в четвертую степень — отрицательные.
 */

public class Task12 {
	

    public static void main(String[] args) {
		
		int a = -2;
		int b = 3;
		int c = 4;
		
		if(a > 0){
			
			System.out.println("a = " + Math.pow(a, 2));
			
		}else
		{
			
			System.out.println("a = " + Math.pow(a, 4));
			
		}
		
		if(b > 0){
			
			System.out.println("b = " + Math.pow(b, 2));
			
		}else
		{
			
			System.out.println("b = " + Math.pow(b, 4));
			
		}
		
		if(c > 0){
			
			System.out.println("c = " + Math.pow(c, 2));
			
		}else
		{
			
			System.out.println("c = " + Math.pow(c, 4));
			
		}
		
    }
}
