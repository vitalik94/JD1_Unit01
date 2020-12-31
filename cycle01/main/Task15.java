package by.htp.cycle01.main;

// Вычислить : 1+2+4+8+...+ 2 в 10 степени

public class Task15 {
	
	public static void main(String[] args) {
		
		int i = 2;
		int a = 0;
		int b;
		int s = 0;
		
		while (a <= 10) {
			
			b = (int) Math.pow(i, a);
			
			a = a + 1;
			
			s = s + b;
			
			System.out.println(b);
		}
		
		System.out.println(s);
		
	}

}
