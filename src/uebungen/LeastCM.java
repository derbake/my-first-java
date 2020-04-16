package uebungen;

/**
 * Created for myFirstProject.
 * Date: 15.04.2020; Time: 15:51
 */
public class LeastCM {
    public static void main(String[] args) {

        int a = 30;
        int b = 30;
        int nod1 = 0;
        int nod2 = 0;
        NOD(a, b, nod1, nod2);


    }

    private static void NOD(int a, int b, int nod1, int nod2) {
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

        //находим НОК
        if (nod1 > 0) {
            int findLCM1 = a * b / nod1;
            System.out.println("Наименьший общее кратное равно:  " + findLCM1);
        } else if (nod2 > 0) {
            int findLCM2 = a * b / nod2;
            System.out.println("Наименьший общее кратное равно:  " + findLCM2);
        }
    }
}