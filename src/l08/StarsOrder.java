package l08;

/**
 * Created for myFirstProject.
 * Date: 21.03.2020; Time: 16:40
 */
public class StarsOrder {
    public static void main(String[] args) {
        String star = "*";
        String line = "";
        int range = 10;

        for (int i = 0; i < range; i++) {
            line = line + star;
            System.out.println(line);
        }

        for (int i = range; i > 0; i--) {
            line = line.substring(0, (line.length() - 1));
            System.out.println(line);
        }





        /*for (int i = 10; i > 0; i--) {
            String star = " ";
            for (int j = 0; j < i; j++) {
                star = star + "*";
            }
            System.out.println(star);
        }*/
    }
}

