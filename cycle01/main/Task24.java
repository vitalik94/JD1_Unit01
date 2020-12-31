package by.htp.cycle01.main;

/* Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. 
 * Преобразовать его в другое число, цифры которого будут следовать в обратном порядке 
 * по сравнению с введенным числом.
 */

public class Task24 {
	
	public static void main(String[] args) {
		
	  int n;
	  int N;
	  int m;
	  int sum;
	  
	  n = 12;
	  
	  N = 0;
	  sum = 0;
	  
	  while(n != 0) {
		  
		  m = n % 10;
		  
		  if(m % 2 == 0) {
			  
			  sum = sum + m;
			  
		  }
		  
		  N = (N + m) * 10;
		  
		  n = (n - m) / 10;
		  
	  }
	  
	  N = N / 10;
	  
	  System.out.println("sum = " + sum);
	  System.out.println("N = " + N);
	
	}

}
