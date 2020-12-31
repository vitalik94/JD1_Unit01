package by.htp.cycle01.main;

// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15. 

public class Task34 {

	public static void main(String[] args) {

		int n;
		int n1;
		int m;
		int sum;

		for (n = 1000; n <= 9999; ) {
			
			n1 = n;
			
			sum = 0;

			while (n1 != 0) {

				m = n1 % 10;
				
				sum = sum + m;
				
				n1 = (n1 - m) / 10;

			}
			
			if(sum == 15) {
				
				System.out.println(n);
				System.out.println(sum);
				
			}

			n++;
			
		}
		
	}

}
