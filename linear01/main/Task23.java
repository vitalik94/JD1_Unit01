package by.htp.linear01.main;

// Найти площадь кольца, внутренний радиус которого равен r, а внешний - R (R > r)

public class Task23 {
	
	public static void main(String[] args) {
		
		int r = 1;
		int R = 2;
		
		double s1 = Math.PI * Math.pow(r, 2);
		double s2 = Math.PI * Math.pow(R, 2);
		double s3 = s2 -s1;
		
		if (R > r) {
			
			System.out.println("s3 = "+ s3);
			
		}else {
			
			System.out.println("неверно");
			
		}
		
	}

}
