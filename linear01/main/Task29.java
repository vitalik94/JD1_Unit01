package by.htp.linear01.main;

// Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c

public class Task29 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		double α;
		double β;
		double γ;
		double r1;
		double r2;
		double r3;
		
		α= Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2))/(2 * b *c));
		β = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2 * a *c));
		γ = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2 * a *b));
		
		r1 = (α * Math.PI)/180;
		r2 = (β * Math.PI)/180;
		r3 = (γ * Math.PI)/180;
		
		System.out.println("α = " + α + "," + "r1 = " + r1);
		System.out.println("β = " + β + "," + "r2 = " + r2);
		System.out.println("γ = " + γ + "," + "r3 = " + r3);
	}

}
