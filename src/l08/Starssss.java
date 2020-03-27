package l08;

/**
 * Created for myFirstProject.
 * Date: 26.03.2020; Time: 21:45
 */
public class Starssss {
    public static void main(String[] args) {
        String space = " ";
        String star = "*";
        String line = "";
        int width = 21;

        for (int i = 0; i < width / 2 - 1; i++) {
            line = line + space;
        }
            line = line + star;
            System.out.println(line);
        line = line + line.substring(0, (line.length() - 2)) + star + star + star;
        System.out.println(line);
    }
}
