package by.htp.linear01.main;

/* Составить программу для вычисления пути, пройденного лодкай, если ее скорость в стоячей воде
 * v км/ч, скорость течения реки v1 км/ч, время движения по озеру - t1 ч, а против тчения
 * реки - t2ч  
 */

public class Task31 {
	
	public static void main(String[] args) {
		
		int v;
		int v1;
		int t1;
		int t2;
		int S;
		
		v = 20;
		v1 = 10;
		t1 = 3;
		t2 = 4;
		
		S = v * t1 + (v - v1) * t2;
		
		System.out.println("S = " + S);
		
	}

}
