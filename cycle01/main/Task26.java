package by.htp.cycle01.main;

/* Вывести  на  экран  соответствий между  символами  и  их  численными  обозначениями 
 * в  памяти компьютера (Таблицу ASCII).
 */

public class Task26 {
	
	public static void main(String [] args) {
		
		int n;
		
		for(n = 0 ; n <= 255 ; n++) {
			
			char m;
			
			m = (char) n;
			
			System.out.println("n = " + n + ", " + "m = " + m);
			
		}
		
	}

}
