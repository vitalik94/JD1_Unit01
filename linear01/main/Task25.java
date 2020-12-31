package by.htp.linear01.main;

/*Вычислить корни квадратного уравнения a*x^2 + b*x + c = 0 с заданными коэффициентами a, b и c   
*(предпологаеться, что a ≠ 0 и что дискриминант уравнения неотрицателен) 
*/

public class Task25 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c = 2;
		double D;
		double x1;
		double x2;
		
		D = Math.pow(b, 2) - 4 * a *c;
		
		if(a != 0 && D > 0) {
			
			x1 = (-b + Math.sqrt(D))/(2*a*c);
			x2 = (-b - Math.sqrt(D))/(2*a*c);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			
		}else if(a != 0 && D == 0){
			
			x1 = -b/(2*a*c);
					
			System.out.println("x1 = " + x1);
			
		}else {
			
			System.out.println("Уравнение не имеет действительных корней");
		}
	}

}
