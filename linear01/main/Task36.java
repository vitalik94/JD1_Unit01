package by.htp.linear01.main;

// Найти частное произведений четных и нечетных цифр четырехзначного числа

public class Task36 {
	
	public static void main(String[] args) {
		
		int n = 1234;
		int n1;
		int n2;
		int n3;
		int n4;
		int x = 1;
		int y = 1;
		double z;
		
		n1 = n / 1000;
		n2 = (n % 1000) / 100;
		n3 = (n % 100) /10;
		n4 = n % 10;
		
		
		
		if(n1%2==0){
				
			 x = x * n1;
			 
		  }
		 
		if(n2%2==0) {
			
			 x = x * n2;
			 
		  }
		if(n3%2==0){
			
			 x = x * n3;
			 
		  }
		 
		if(n4%2==0) {
			
			 x = x * n4;
			 
		  }
		
		System.out.println("x = " + x);
		
		if(n1%2!=0){
			
			 y = y * n1;
			 
		  }
		 
		if(n2%2!=0) {
			
			 y = y * n2;
			 
		  }
		if(n3%2!=0){
			
			 y = y * n3;
			 
		  }
		 
		if(n4%2!=0) {
			
			 y = y * n4;
			 
		  }
		
		System.out.println("y = " + y);
		
		z = (double)x / y;
		System.out.println("z = " + z);
	}

}
