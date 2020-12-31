package by.htp.linear01.main;

// Найти площадь равнобедренной трапеции с основаниями a и b и углом α при большем основании a 

public class Task24 {
	
	public static void main(String[] args) {
		
		int a = 26;
		int b = 10;
		int α = 45;
		double S = ((Math.pow(a, 2) - Math.pow(b, 2)) * Math.tan(α)) / 4;
		
		if (a > b) {
			
			System.out.println("S = " + S);
			
		}else {
			
			System.out.println("ответ неверный");
			
		}
		
	}

}
