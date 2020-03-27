package l09;

/**
 * Created for myFirstProject.
 * Date: 25.03.2020; Time: 10:48
 * int a = 5;
 * int b = 17;
 * for (int i = a; i < b; i++) {
 * System.out.println("i " + i);
 */
public class WhileTwo {
    public static void main(String[] args) {
        int i = 5;
        while (true) {
            System.out.println(i);
            i++;
            if (i > 17)
                break;
        }
    }
}
