package by.htp.linear01.main;

/* Текущее показание электронных часов: m ч (0≤m≤23), n мин (0≤n≤59), k с (0≤k≤59)/
 * Какое время будут показывать часы через p ч q мин r с   
 */

public class Task32 {
	
	public static void main(String[] args) {
		
		int m = 1;
		int n = 2;
		int k = 3;
		int p = 100;
		int q = 200;
		int r = 300;
		
		m = m + p;
		n = n + q;
		k = k + r;
		
		if(0<=m & m<=23) {
			
			System.out.print(m + "ч");
			
		}else {
			
			while(m > 23){
				
				m = 0 + (m - 24);
			}
		System.out.print(m + "ч" );			
		} 
		
		if(0<=n & n<= 59) {
			
			System.out.print(n + "мин");
			
		}else {
			
			while(n > 59) {
				
				n = 0 + (n - 60);
			}
		System.out.print(n + "мин" );	
		}
		
		if(0<=k & k<=59) {
			
			System.out.print(k + "c");
			
		}else {
			
			while(k > 59) {
				
				k = 0 + (k - 60);
			}
		System.out.print(k + "c" );	
		}
	}

}
