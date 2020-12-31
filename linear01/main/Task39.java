package by.htp.linear01.main;

/* Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, 
 * кроме умножения, сложения и вычитания, вычислите за минимальное число операций: 
 * 2x^4 - 3х^3 + 4х^2 - 5х + 6. 
 */

public class Task39 {
	
	public static void main(String[] args) {
		
		int x;
		int z;
		
		x = 1;
		
		z = (((2*x - 3)*x + 4)*x - 5)*x + 6;
		
		System.out.println("z = " + z);
		
	}

}
