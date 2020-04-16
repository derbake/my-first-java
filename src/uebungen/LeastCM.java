package uebungen;

/**
 * Created for myFirstProject.
 * Date: 15.04.2020; Time: 15:51
 * Найти наименьшее общее кратное чисел 20 и 30.
 */
public class LeastCM {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        System.out.println("наибольший общий делитель  " + findGreatestCommonDivisor(a, b));
        System.out.println("НОК   " + findLeastCommonMultiple(a, b));
    }

    private static int findLeastCommonMultiple(int a, int b) {
        int result = (a / findGreatestCommonDivisor(a, b)) * (b / findGreatestCommonDivisor(a, b)) * findGreatestCommonDivisor(a, b);
        return result;
    }

    private static int findGreatestCommonDivisor(int a, int b) {
        int temp;
        while (a != 0 && b != 0) {
            a = a % b;
            temp = a;
            a = b;
            b = temp;
        }
        return a + b;
    }
}