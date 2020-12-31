package by.htp.branching01.main;

/* Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом,
 * равным большему из исходных, а если равны, то заменить числа нулями
 */

public class Task17 {
	
    public static void main(String[] args) {
    	
    	int m = 1;
    	int n = 1;
    	
    	if (m == n) {
    		
    		System.out.println("m = " + 0);
    		System.out.println("n = " + 0);
    		
    	}else if(m != n & m < n){
    		
    		System.out.println("m = " + n);
    		System.out.println("n = " + n);
    		
    	}else if(m != n & m > n){
    		
    		System.out.println("m = " + m);
    		System.out.println("n = " + m);
    		
    	} 
    	
    }

}
