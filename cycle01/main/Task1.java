package by.htp.cycle01.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a;

		a = sc.nextLine();

		Pattern p = Pattern.compile("[а-я0-9_ ]+");
		Matcher m = p.matcher(a);
		
		char ch = a.charAt(0);

		while (m.find()) {

			a = sc.nextLine();

			if (ch == '_' ) {

				System.out.println("В строке допустимые символы");

			} else {

				System.out.println("Первый символ недопустим");

			}
			
		}
		
	}

}

//ch >= 'а' | ch <= 'я'
