package by.htp.branching01.main;

// Составить программу, которая определит площадь какого треугольника больше 

public class Task11 {
	
    public static void main(String[] args) {
		
		int b1 = 1;
		int b2 = 2;
		int h1 = 3;
		int h2 = 4;
		double s1;
		double s2;
		
		s1 = (b1 * h1) / 2;
		s2 = (b2 * h2) / 2;
		
		if(s1>s2) {
			
			System.out.println("площадь треугольника s1 больше площадь треугольника s2");
			
		}else if(s2>s1){
			
			System.out.println("площадь треугольника s2 больше площадь треугольника s1");
			
		}else {
			
			System.out.println("s1 равно s2");
			
		} 
		
		
		
    }	

}
