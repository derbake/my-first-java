/**
 * Created for myFirstProject.
 * Date: 21.03.2020; Time: 16:40
 */
public class StarsOrder {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            String star = " ";
            for (int j = 0; j < i; j++) {
              star = star + "*";
            }
            System.out.println(star);
        }
        }
    }

