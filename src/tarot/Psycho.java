package tarot;

/**
 * Created for myFirstProject.
 * Date: 05.04.2020; Time: 22:58
 */
public class Psycho {
    public static void inputBirthday(int day, int month, int year) {
        System.out.println("День рождения: " + day);
        System.out.println("Месяц рождения: " + month);
        System.out.println("Сумма цифр года рождения: " + digitsSummerYear(year));
        System.out.println("Сумма цифр дня и месяца рождения: " + (day + month));
        System.out.println("Производная сумм - года и месяца: " + (digitsSummerYear(year) + month));
        System.out.println("Проверка на 22: " + proove22(digitsSummerYear(year)));

    }

    private static int proove22(int digitsSummerYear) {
        int result = 0;
      //домашнее задание

        return result;
    }

    private static int digitsSummerYear(int year) {
        int result = 0;
        int a, b, c, d;
        a = year / 1000;
        b = year % 1000 / 100;
        c = year % 100 / 10;
        d = year % 10;
        result = a + b + c + d;
        return result;
    }
}
