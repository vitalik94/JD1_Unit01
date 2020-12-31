package by.htp.branching01.main;

/*Составить  программу,  которая  определит  по  трем  введенным  сторонам,  
 * является  ли  данный  треугольник равносторонним. 
 */

public class Task09 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int c = 1;
		
		if(a==b & a==c) {
			
			System.out.println("треугольник равносторонний");
			
		}else if(a==b & b!=c & a!=c|a==c & a!=b & c!=b|b==c & b!=a & c!=a) {
			
			System.out.println("треугольник равнобедренный");
			
		}else if(a!=b & a!=c & b!=c) {
			
			System.out.println("треугольник не равносторонни");
			
		}
		
	}

}
