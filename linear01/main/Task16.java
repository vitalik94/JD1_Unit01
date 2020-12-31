package by.htp.linear01.main;

// Найти произведение чисел заданного четырехзначного числа 

public class Task16 {
	
	public static void main(String[] args) {
		
		int x;
		int x1;
		int x2;
		int x3;
		int x4;
		int y;
		
		x = 1234;
		
		x1 = x / 1000;
		x2 = (x / 100) % 10;
		x3 = (x % 100) / 10;
		x4 = x % 10;
		y = x1 * x2 * x3 * x4;
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
		System.out.println("x4 = " + x4);
		System.out.println("y = " + y);
				
	
	}
	
	

}
