/**
 * Created for myFirstProject.
 * Date: 14.03.2020; Time: 20:28
 */

public class Replace{
    public static void main(String[] args) {

        String name = "Добро пожаловать";
        int dlina = name.length();
        System.out.println(dlina);
        System.out.println(name);
        // замена

        String oldString = "Добро пожаловать";
        String newString =  oldString.replace("аловать", "нельзя");

        System.out.println("Старое выражение: " + oldString);
        System.out.println("Новое выражение с заменой последних семи символов: " + newString);
    }
}