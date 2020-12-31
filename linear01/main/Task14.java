package by.htp.linear01.main;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R 

public class Task14 {
	
	public static void main(String[] args) {
		
		int R;
		
		double L;
		double S;
		
		R = 10;
		
		L = 2 * Math.PI * R;
		S = Math.PI * Math.pow(R, 2);
		
		System.out.println("L = " + L );
		System.out.println("S = " + S );
		 
	}

}
