package by.htp.linear01.main;

// Вычислить значение выражения по формуле ( все переменные принимают действительные значения):
// ((b + √ (b^2 + 4*a*c))/2*a) - (a^3)*c + b^(-2)

public class Task08 {
	
	public static void main(String[] args) {
		
		double a = 1;
		double b = 2;
		double c = 3;
		
		double z = ((b + Math.sqrt(Math.pow(b,2) + 4 * a *c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b,-2);
		
		System.out.println(" z = " + z );
	}

}
