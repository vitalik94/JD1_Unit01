package by.htp.linear01.main;

// Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

public class Task20 {
	
	public static void main(String[] args) {
		
		int L;
		
		double S;
		
		L = 20;
		
		S = Math.pow(L, 2) / (4 * Math.PI);
		
		System.out.println("S = " + S);
		
	}

}
