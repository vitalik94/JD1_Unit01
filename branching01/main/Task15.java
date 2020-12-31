package by.htp.branching01.main;
/* Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить
 * половиной их суммы, а большее — их удвоенным произведением. 
 */

public class Task15 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 2;
		double a;
		int b;
		
		a = (x + y) / 2;
		b = (x * y) * 2;
		
		if(x < y) {
			
			System.out.println("x = " + a);
			System.out.println("y = " + b);
			
		} else if(x > y) {
			
			System.out.println("x = " + b);
			System.out.println("y = " + a);
			
		}else {
			
			System.out.println("ответ неверный");
			
		}
		
	}
}
