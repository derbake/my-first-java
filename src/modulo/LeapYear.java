package modulo;

import java.util.Scanner;

/**
 * Created for myFirstProject.
 * Date: 30.03.2020; Time: 16:43
 *
 */
public class LeapYear {
	public static void main(String[] args) {
		int year;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите год на проверку високосности:");
		year = scanner.nextInt();
		System.out.println(year + " год. Проверка на високосность - " + leapYearProov(year));
	}

	public static boolean leapYearProov(int year) {
		boolean leapOrNotLeap = false;

		int var400 = 400;
		int var4 = 4;
		int var100 = 100;

		leapOrNotLeap = (year % var400 == 0) ||
				(year % var4 == 0 && year % var100 != 0);
		return leapOrNotLeap;
	}
}
