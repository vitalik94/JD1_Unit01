package by.htp.cycle01.main;

// Дано натуральное n, вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

public class Task14 {
	
	public static void main(String[] args) {
		
		double n = 1;
		double s = 0;
		int i = 10;
		
		while(n <= i ) {
			
			s = s + 1/n;
				
			n = n + 1;
				
		}
		
		System.out.println("s = " + s);	
	}

}
