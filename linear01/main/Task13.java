package by.htp.linear01.main;

// Заданы координаты трех вершин треугольника (x1,y1), (x2,y2), (x3,y3). Найти его периметр и площадь 

public class Task13 {
	
	public static void main(String[] args) {
		
		double x1 = 1;
		double y1 = 2;
		double x2 = 15;
		double y2 = 20;
		double x3 = 35;
		double y3 = 45;
		
		double a;
		double b;
		double c;
		double p;
		double p1;
		double s;
		
		a = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		b = Math.sqrt(Math.pow((x3-x2), 2) + Math.pow((y2-y3), 2));
		c = Math.sqrt(Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2));
		
		p = a + b + c;
		p1 = (a + b + c) / 2;
		s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
		
		System.out.println("p = " + p);
		System.out.println("s = " + s);
		
				
	}

}
