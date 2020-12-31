package by.htp.cycle01.main;

import java.util.Scanner;

// Написать программу, переводящую римские цифры в арабские. 

public class Task30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String r = sc.nextLine();

		int i;
		int a;
		int s;

		s = 0;

		for (i = 0; i < r.length(); i++) {

			char ch = r.charAt(i);

			if (ch == 'I') {

				a = 1;

				s = s + a;

			} else if (ch == 'V') {

				a = 5;

				if (s % 10 == 0) {

					s = s + a;

				} else {

					s = (s + a) - 2;

				}

			} else if (ch == 'X') {

				a = 10;

				if (s % 10 == 0) {

					s = s + a;

				} else {

					s = (s + a) - 2;

				}

			} else if (ch == 'L') {

				a = 50;

				if (s % 100 == 0) {

					s = s + a;

				} else {

					s = (s + a) - 20;

				}

			} else if (ch == 'C') {

				a = 100;

				if (s % 100 == 0) {

					s = s + a;

				} else {

					s = (s + a) - 20;

				}

			} else if (ch == 'D') {

				a = 500;

				if (s % 1000 == 0) {

					s = s + a;

				} else {

					s = (s + a) - 200;

				}

			} else if (ch == 'M') {

				a = 1000;

				if (s % 1000 == 0) {

					s = s + a;

				} else {

					s = (s + a) - 200;

				}

			} else {

				System.out.println("неверное число");

				s = 0;

			}

		}

		System.out.println(s);

	}

}
