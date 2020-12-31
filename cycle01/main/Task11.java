package by.htp.cycle01.main;

// Составить программу нахождения разности кубов первых двухсот чисел 

public class Task11 {
	
	 public static void main(String[] args) {
			
	    	int i = 1;
			int s = 1;
			
			while(i < 201) {
				
				System.out.println(i);
				
				s = (int)(s - Math.pow(i, 3));
				
				i = i + 1;
				
			}
			System.out.println(s);
			
		}

}
