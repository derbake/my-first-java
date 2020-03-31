package modulo;

import java.util.Scanner;

/**
 * Created for myFirstProject.
 * Date: 30.03.2020; Time: 16:43
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

		int var1 = 400;
		int var2 = 4;
		int var3 = 100;

		if ((year % var2 == 0) || (year % var2 == 0 && year % var1 == 0) || (year % var2 == 0 && year % var3 != 0)) {
			System.out.println("Високосный год");
            leapOrNotLeap = true;
		} else {
			System.out.println("Не високосный год");
		}
		return leapOrNotLeap;
	}
}
