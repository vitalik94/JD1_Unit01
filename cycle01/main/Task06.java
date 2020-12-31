package by.htp.cycle01.main;

/* Напишите программу,  где пользователь вводит любое целое положительное число. А программа 
 * суммирует все числа от 1 до введенного пользователем числа
 */

public class Task06 {
	
	public static void main(String[] args) {
		
		int i = 20;
		int s = 0;
		
		while(i > 0) {
			
			System.out.println(i);
			
			s = s + i;
			i = i - 1;
			
		}
		System.out.println(s);
		
	}

}
