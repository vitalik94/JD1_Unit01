package by.htp.linear01.main;

/* Составить линейную программу, печатающую значение true, если указанное высказывание является
 * истинным, и false - в противном случае:
 * 
 *  1)Целое число N является четным двузначным числом.
 *  2)Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр. 
 *  3)Сумма цифр данного трехзначного числа N является четным числом. 
 *  4)Точка с координатами (х, у) принадлежит части плоскости,
 *   лежащей между прямыми х= т, х= п (т<п). 
 *  5)Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа. 
 *  6)Треугольник со сторонами а,b,с является равнобедренным. 
 *  7)Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре. 
 *  8)Заданное число N является степенью числа а (показатель степени может находиться 
 *  в диапазоне от 0 до 4). 
 *  9)График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, n). 
 */

public class Task37 {
	
	public static void main(String[] args) {
		
		boolean t = true;
		boolean f = false;
		
		int N;
		
		N =20;
		
		if(N%2==0 & 9 < N & N < 100) {
			
			System.out.println("1)" + t);
			
		}else {
			
			System.out.println("1)" + f);
		}
		
		int nnnn;
		int n1;
		int n2;
		int n3;
		int n4;
		
		nnnn = 1234;
		n1 = nnnn / 1000;
		n2 = (nnnn % 1000) / 100;
		n3 = (nnnn % 100) /10;
		n4 = nnnn % 10;
		
		if((n1+n2)==(n3+n4)) {
			
			System.out.println("2)" + t);
			
		}else {
			
			System.out.println("2)" + f);
			
		}
		
		int nnn;
		
		nnn = 123;
		n1 = nnn / 100;
		n2 = (nnn % 100) / 10;
		n3 = nnn % 10;
		
		if(99<nnn & nnn<1000 & (n1+n2+n3)%2==0) {
			
			System.out.println("3)" + t);
			
		}else {
			
			System.out.println("3)" + f);
			
		}
		
		int x;
		int m;
		int n;
		
		x = 1;
		m = 10;
		n = 20;
		if(m<n & x>m & x<n) {
			
			System.out.println("4)" + t);
			
		}else {
			
			System.out.println("4)" + f);
			
		}
		
		nnn = 123;
		n1 = nnn / 100;
		n2 = (nnn % 100) / 10;
		n3 = nnn % 10;
		
		if(99<nnn & nnn<1000 & Math.pow(nnn, 2)==Math.pow((n1+n2+n3), 3)) {
			
			System.out.println("5)" + t);
			
		}else {
			
			System.out.println("5)" + f);
			
		}
		
		int a;
		int b;
		int c;
		
		a = 1;
		b = 1;
		c = 2;
		
		if(a==b & a!=c & b!=c|b==c & b!=a & c!=a|a==c & a!=b & c!=b) {
			
			System.out.println("6)" + t);
			
		}else {
			
			System.out.println("6)" + f);
			
		}
		
		
		nnn = 123;
		n1 = nnn / 100;
		n2 = (nnn % 100) / 10;
		n3 = nnn % 10;
		
		if(n1+n2==n3|n1+n3==n2|n2+n3==n1) {
			
			System.out.println("7)" + t);
			
		}else {
			
			System.out.println("7)" + f);
			
		}
		
		a = 2;
		N = 2;
		
		if(N>=0 & N<=4) {
			
			System.out.println("8)" + t);
			
		}else {
			
			System.out.println("8)" + f);
			
		}
		
		int y;
		a = 1;
		b = 2;
		c = 3;
		m = 1;
		x = 1;
		y = (int)(a * Math.pow(x, 2) + b * x + c);
		n = (int)(a * Math.pow(m, 2) + b * m + c);
		
		if(m==x & n==y) {
			
			System.out.println("9)" + t);
			
		}else {
			
			System.out.println("9)" + f);
			
		}
	
	}
	
}