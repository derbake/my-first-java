package password;

/**
 * Created for myFirstProject.
 * Date: 02.04.2020; Time: 11:00
 * Давайте напишем генератор паролей.
 * Методу передаётся длина пароля.
 * И метод генерирует пароль используя латиницу
 * Подсказка - использовать только те знания, которые были уже изучены.
 * Существует как минимум два(на самом деле 222) разных подхода к решению этой проблемы. Не бойтесь пробовать.
 */
public class Lesson13 {
    public static void main(String[] args) {
        System.out.println(latinGen(20));
    }

    private static String latinGen(int lengthPassword) {
        String result = "";
        int min = 60; //65
        int max = 200; //91

        for (int i = 0; i < lengthPassword; i++) {
            int charNumber = (int) (Math.random() * ((max - min) + 1)) + min;
            char zahl = (char) charNumber;
            result = result + zahl;
        }
        return result.toLowerCase();
    }
}
