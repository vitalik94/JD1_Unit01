package by.htp.cycle01.main;

import java.util.Scanner;

// Требуется определить факториал числа, которое ввел пользователь. 

public class Task25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		int p;

		p = 1;

		System.out.print("> ");

		n = sc.nextInt();

		while (n > 0) {

			p = p * n;

			n = n - 1;

		}

		System.out.println("p = " + p);

	}

}
