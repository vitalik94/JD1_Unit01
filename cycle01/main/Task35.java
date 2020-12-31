package by.htp.cycle01.main;

// Найдите количество четных цифр данного натурального числа. 

public class Task35 {
	
	public static void main(String[] args) {
		
		int n;
		int m;
		int a;
		
		n = 1234;
		a = 0;
		
		System.out.println(n);
		
		while (n != 0) {

			m = n % 10;
			
			if(m % 2 == 0) {
				
				a = a + 1;
				
			}
			
			n = (n - m) / 10;

		}
		
		System.out.println(a);
		
	}

}
