package by.htp.linear01.main;

// Вычислить значение выражения по формуле ( все переменные принимают действительные значения):
// (a / c) * (b / d) - (a * b - c) / (c * d)

public class Task09 {
	
	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c = 3;
		double d = 4;
		
		double z = (a / c) * (b / d) - (a * b - c) / (c * d);
		
		System.out.println("z = " + z);
		
	}

}
