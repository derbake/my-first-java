import password.Lesson13;
import tarot.Psycho;

/**
 * Created for myFirstProject.
 * Date: 09.04.2020; Time: 10:03
 */
public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        int c = 1983;
        Psycho.inputBirthday(13, 1, 1981);
        Psycho.inputBirthday(a, b, c);
        Psycho.inputBirthday(Lesson13.intRandom(1, 28), Lesson13.intRandom(1, 12), Lesson13.intRandom(1960, 2000));
    }
}
