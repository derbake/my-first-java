package l02;

/**
 * Created for myFirstProject.
 * Date: 14.03.2020; Time: 19:08
 */
public class AreaCircle {
    public static void main(String[] args) {
        final double PI = 3.14;
        int r = 16;
        int a = 2;
       //вычисляем r в квадрате
        double r1 = Math.pow(r, a);
        // вычисляем площадь круга по формуле
        double s = (PI * r1);
        System.out.println("Площадь круга s равна  " + s);
    }
}
