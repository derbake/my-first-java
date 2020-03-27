/**
 * Created for myFirstProject.
 * Date: 17.03.2020; Time: 00:28
 */
public class MyAlgebra {
    public static void main(String[] args) {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;
        boolean c = 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4;
        boolean e = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5;
        boolean f = !(3 * 4 < 7 + 8);
        boolean b = !(7 * 45 < 31 * 9 & 12 / 2 > 2);
        boolean d = 16 > 36 | -12 > 12;
        System.out.println(a + "\n" + "\n" + c + "\n" + "\n" + e + "\n" + f + "\n" + b + "\n" + d);
    }
}
