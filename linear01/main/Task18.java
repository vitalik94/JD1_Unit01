package by.htp.linear01.main;

// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и обьем этого куба

public class Task18 {
	
	public static void main(String[] args) {
		
		int a;
		
		int S1;
		int S;
		int V;
		
		a = 72;
				
		S1 = (int) Math.pow(a, 2);
		S = S1 * 6;
		V = (int) Math.pow(a, 3);
		
		System.out.println("S1 = " + S1);
		System.out.println("S = " + S);
		System.out.println("V = " + V);
		
	}

}
