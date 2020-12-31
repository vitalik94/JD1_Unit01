package by.htp.linear01.main;

// Составить программу перевода радианной меры угла в градусы, минуты и секунды

public class Task28 {
	
	public static void main(String[] args) {
		
		int r;
		double c;
		double m;
		double s;
		
		r = 29;
		
		c = (r * 180)/Math.PI;
		m = (r * 60 * 180)/Math.PI;
		s = (r * 3600 * 180)/Math.PI;
		
		System.out.println("c = " + c);
		System.out.println("m = " + m);
		System.out.println("s = " + s);
		
	}

}
