package by.htp.cycle01.main;

/* Последовательность аn строится так: а1 = 1, an = 6 + аn-1 , для каждого n >1 
 * Составьте программу нахождения произведения первых 10 членов этой последовательности
 */

public class Task12 {
	
	public static void main(String[] args) {
		
		int a = 1;
		long s = 1;	
		while(a <= 60) {
			
			System.out.println(a);
			
			s = s * a;
			
			a = 6 + a;
			
		}
		System.out.println(s);
	}

}
