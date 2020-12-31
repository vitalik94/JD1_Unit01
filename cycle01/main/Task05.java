package by.htp.cycle01.main;

/* С  помощью  оператора  while  напишите  программу  определения  суммы  всех  нечетных  чисел 
 * в диапазоне от 1 до 99 включительно
 */

public class Task05 {
	
	public static void main(String[] args) {
		
		int i = 1;
		int s = 0;
		
		while(i <= 99) {
			
			System.out.println(i);
			
			s = s + i;
			i = i + 2;
			
		}
		System.out.println(s);
	}	
}
