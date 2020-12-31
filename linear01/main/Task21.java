package by.htp.linear01.main;

// Данно действительное число R вида nnn.ddd (три цифровых разряда в дробной и целых частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task21 {
	
	public static void main(String[] args) {
		
		double r = 123.456;
		double a = (int) r;
		int b =(int) ((r - a) * 1000);
		double c = b + a / 1000;
		
		System.out.println("c = " + c);
	    
		
	}

}
