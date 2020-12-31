package by.htp.branching01.main;

// Составить программу нахождения наименьшего из квадратов двух чисел а и b

public class Task08 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		if(Math.pow(a, 2) < Math.pow(b, 2)) {
			
			System.out.println("a^2 меньше b^2");
			
		}else if(Math.pow(b, 2) < Math.pow(a, 2)) {
			
			System.out.println("b^2 меньше a^2");
			
		}else {
			
			System.out.println("ответ неверный");
			
		}
		
		
	}

}
