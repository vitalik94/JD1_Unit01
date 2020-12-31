package by.htp.linear01.main;

// Дана сторона равностороннего треугольника. 
// Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.

public class Task19 {
	
	public static void main(String[] args) {
		
		int a;
		
		double h;
		double S;
		double r1;
		double r2;
		
		a = 10;
		
		h = a * Math.sqrt(3) / 2;
		S = (a * h) / 2;
		r1 = a * Math.sqrt(3) / 6;
		r2 = a * Math.sqrt(3) / 3;
		
		System.out.println("h = " + h);
		System.out.println("S = " + S);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
			
	}
	

}
