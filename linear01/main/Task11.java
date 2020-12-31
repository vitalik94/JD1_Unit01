package by.htp.linear01.main;

//Вычислить периметр и площаодь прямоугольного треугольника по длинам a и b двух катетов

public class Task11 {
	
	public static void main(String[] args) {
		
		int a;
		int b;
		
		double c;
		double p;
		double s;
		
		a = 3;
		b = 4;
		
		c = Math.sqrt(a * a + b * b);
		
		p = a + b + c;
		s = (a * b) / 2;
		
		System.out.println("p = " + p);
		System.out.println("s = " + s);
	}

}
