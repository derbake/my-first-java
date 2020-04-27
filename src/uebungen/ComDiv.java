package uebungen;

/**
 * Created for myFirstProject.
 * Date: 15.04.2020; Time: 17:01
 * Найти наибольший общий делитель для чисел 36, 60, 42.
 */
public class ComDiv {
    public static void main(String[] args) {
        int a = 40;
        int b = 62;
        int c = 56;
        findComDiv(a, b, c);
    }

    private static void findComDiv(int a, int b, int c) {
        int nod1 = 0;
        int nod2 = 0;
        int gcd1 = 0;
        int gcd2 = 0;

        if (a != b) {
            if (a > b) {
                nod1 = a - b;
                System.out.println("Наибольший общий делитель " + "nod_1  " + nod1);
            } else {
                nod2 = b - a;
                System.out.println("Наибольший общий делитель " + "nod_1  " + nod2);
            }
        } else {
            nod1 = a;
            System.out.println("Наибольший общий делитель " + "nod_1  " + nod1);
        }

        if (nod1 > 0) {
            if (nod1 > c) {
                gcd1 = nod1 - c;
                System.out.println("jrjyxfn Наибольший общий делитель " + gcd1);
            } else {
                gcd2 = c - nod1;
                System.out.println("Наибольший общий делитель " + gcd2);
            }
        }
    }
}

