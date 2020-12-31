package by.htp.linear01.main;

// Вычислить расстояние между двумя точками с данными координатоми (x1, y1) и (x2, y2)

public class Task12 {
	
	public static void main(String[] args) {
		
		double x1 = 5;
		double y1 = 6;
		double x2 = 17;
		double y2 = 19;
		
		System.out.println("√((x2 - x1)^2 + (y2 - y1)^2) = " + Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)));
	}

}
