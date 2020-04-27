package uebungen;

/**
 * Created for myFirstProject.
 * Date: 27.04.2020; Time: 17:41
 * томобиль проехал 310 км, истратив 25 л бензина.
 * Какое расстояние может проехать автомобиль на полном баке, вмещающем 40л?
 */
public class numberSix {
    public static void main(String[] args) {
        int distance = 310;
        int benzin = 25;
        int benzin2 = 40;
        findDistanse(benzin, distance, benzin2);
    }

    private static void findDistanse(int benzin, int distance, int benzin2) {
        int findDistanse = benzin2 * distance / benzin;
        System.out.println(findDistanse);
    }
}
