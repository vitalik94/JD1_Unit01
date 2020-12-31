package by.htp.branching01.main;

/*Составить программу нахождения модуля выражения a*x*x + b*x + c
 *при заданных значениях a, b, c и х   
 */

public class Task07 {
	
	 public static void main(String[] args){
		 
		 int a = 1;
		 int b = 2;
		 int c = 3;
		 int x = 4;
		 
		 if((a * x * x + b * x + c) >= 0) {
			 
			 System.out.println("1)" + (a * x * x + b * x + c));
			  
		 }else {
			 
			 System.out.println("2)" + (a * x * x + b * x + c));
			 
		 }
		 
	 }

}
