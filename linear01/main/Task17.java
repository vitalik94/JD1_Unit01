package by.htp.linear01.main;

// Данны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел

public class Task17 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		double x;
		double y;
		
		a = 1;
		b = 2;
		
		x = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		y = Math.sqrt(Math.abs(a * b));
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
	}

}

