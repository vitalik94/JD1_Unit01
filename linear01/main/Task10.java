package by.htp.linear01.main;

// Вычислить значение выражения по формуле ( все переменные принимают действительные значения):
// ((sin x + cos y)/(cos x - sin x)) * tg (x * y)

public class Task10 {
	
	public static void main(String[] args) {
		
		double x = 30;
		double y = 45;
		
		System.out.println("((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(x))) * Math.tan(x * y) = " + ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(x))) * Math.tan(x * y));
	}

}
