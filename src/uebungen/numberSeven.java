package uebungen;

/**
 * Created for myFirstProject.
 * Date: 27.04.2020; Time: 17:48
 * В коробке 48 пачек чая по 250 г в каждой. Сколько получится из этого чая пачек по 150г
 */
public class numberSeven {
    public static void main(String[] args) {
        int numberTeaBox = 48;
        int weightTeaBox = 250;
        int weightTeaBox2 = 150;
        howManyTeaBox(numberTeaBox, weightTeaBox, weightTeaBox2);
    }

    private static void howManyTeaBox(int numberTeaBox, int weightTeaBox, int weightTeaBox2) {
        int allWeight = numberTeaBox * weightTeaBox;
        int howManyTeaBox = allWeight / weightTeaBox2;
        System.out.println("Получится " + howManyTeaBox + " пачек чая");
    }
}
