package by.htp.cycle01.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Проверить введенную пользователем строку на наличие недопустимых символов. 
 * В качестве первого символа допустимы только буквы и знак подчеркивания. 
 * Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
 */

public class Task32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a;

		a = sc.nextLine();

		while (!a.equals("!")) {

			a = sc.nextLine();

			if (a.matches("[А-я0-9_ ]+")) {

				char ch = a.charAt(0);

				if (ch == '_' | (ch >= 'А' && ch <= 'я')) {

					System.out.println("В строке допустимые символы");

				} else {

					System.out.println("Первый символ недопустим");

				}

			} else {

				System.out.println("В строке недопустимые символы");

			}

		}

	}

}
