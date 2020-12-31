package by.htp.linear01.main;

//Найти площадь треугольника, две стороны которого равны a и b, а угол между этими сторонами y   

public class Task26 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int y = 147;
		
		double S = ((a * b) * Math.sin(y))/2;
		
		System.out.println("S = "+ S);
		
	}

}
