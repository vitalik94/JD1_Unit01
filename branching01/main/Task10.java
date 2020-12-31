package by.htp.branching01.main;

// Составить программу, которая определит площадь какого круга меньше. 

public class Task10 {
	
	public static void main(String[] args) {
		
		int r1 = 1;
		int r2 = 2;
		double s1;
		double s2;
		
		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);
		
		if(s1<s2) {
			
			System.out.println("s1 меньше s2");
			
		}else if(s2<s1){
			
			System.out.println("s2 меньше s1");
			
		}else {
			
			System.out.println("s1 равно s2");
			
		} 
		
	}

}
