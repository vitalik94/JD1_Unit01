package by.htp.cycle01.main;

// Найти сумму квадратов первых ста чисел

public class Task09 {
	
    public static void main(String[] args) {
		
    	int i = 0;
		int s = 0;
		
		while(i < 100) {
			
			s = (int)(s + Math.pow(i, 2));
			
			i = i + 1;
			
			System.out.println(i);
	
		}
		System.out.println(s);
		
	}

}
