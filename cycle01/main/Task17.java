package by.htp.cycle01.main;

// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 10;
		int i = 0;
		int n = a;

		while (i<=b - 1) {
			
			i = i + 1;
			
			n = n * (a + i);
			
		}
		System.out.println(n);
	}

}
