package by.htp.cycle01.main;

// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)

public class Task16 {

	public static void main(String[] args) {
		
		int a = 3;
		long b = 3;

		for(int i = 2 ; i <= 10; ) {
			
			System.out.println(a);
			
			a = a + i + 1;
			
			i++;
			
			b = a * b;
			
		}
		
		System.out.println(b);
    
	}

}
