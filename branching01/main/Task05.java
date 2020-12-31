package by.htp.branching01.main;

// Составить программу: определения наименьшего из двух чисел а и b. 

public class Task05 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		if(a < b) {
			
			System.out.println("a меньше b");
			
		}else if(b < a){
			
			System.out.println("b меньше a");

		}else {
			
			System.out.println("ответ неверный");
			
		}
		
	}

}
