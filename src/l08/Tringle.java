package l08;

/**
 * Created for myFirstProject.
 * Date: 25.03.2020; Time: 23:50
 */
public class Tringle {
    public static void main(String[] args) {
        String space = " ";
        String star = "*";
        String line = "";
        int width = 20;

        for (int i = 0; i < width; i++) {
            line = line + star;
            System.out.println(line);
        }
        for (int i = 0; i < width; i += 2) {
            line = line.substring(0, (line.length() - 2));
        }
        //line = space + line;
        System.out.println(line);

    }

}