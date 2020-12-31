package by.htp.cycle01.main;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task29 {
	
	public static void main(String[] args) {
		
		int n;
		int m;
		int n1;
		int m1;
		
		n = 12;
		n1 = 34;
		
		System.out.println("n = " + n);
		
		while(n != 0) {
			
			m = n % 10;
			
			System.out.println("m = " + m);
			
			n = (n - m) / 10;
			
		}
		
		System.out.println();
		System.out.println("n1 = " + n1);
		
		while(n1 != 0) {
			
			m1 = n1 % 10;
			
			System.out.println("m1 = " + m1);
			
			n1 = (n1 - m1) / 10;
			
		}
		
	}

}
