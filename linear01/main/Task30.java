package by.htp.linear01.main;

// Три сопротивления R1, R2, и R3. Соединены параллельно. Найдите сопротивление соединения  

public class Task30 {
	
	public static void main(String[] args) {
		
		double R1;
		double R2;
		double R3;
		double R;
		
		R1 = 1;
		R2 = 2;
		R3 = 3;
		
		R = 1 / ((1/R1) + (1/R2) + (1/R3));
		
		System.out.println("R = " + R);
		
	}

}
