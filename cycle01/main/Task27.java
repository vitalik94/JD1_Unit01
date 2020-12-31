package by.htp.cycle01.main;

import java.util.Scanner;

/* Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы 
 * и самого числа. m и n вводятся с клавиатуры.
 */

public class Task27 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int j;
		int m;
		int n;

		i = 10;
		
		System.out.println("i = " + i);
		
		System.out.println();
		
		System.out.print("> ");
		m = sc.nextInt();
		
		System.out.print("> ");
		n = sc.nextInt();
		
		System.out.println();
		
		for(j = m ; j <= n ; ) {
			
			if(i % j == 0 & j != 1 & j != i) {
		            	
				System.out.println("j = " + j);
				
			}else if(j == 1 & j == i){
				
				System.out.print(" ");
				
			}
				
			j++;
			
		}
		
	}
	
}
