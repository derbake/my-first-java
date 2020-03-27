/**
 * Created for myFirstProject.
 * Date: 13.03.2020; Time: 10:06
 */
public class HelloChar {
    public static void main(String[] args) {

        char zahl = 16;
        // Сотый по счёту символ в таблице
        char octal = '\u039A';
        // Вызов определённого символа кодом
        char zeichen = 'A';
        // Буква A
        char tabulator = '\t'; // В русском языке клавиша называется "Таб"
        // Табулятор
        char phi = '\u03A6';
        // Греческая буквая Фита - PHI

        System.out.println(zahl);
        System.out.println(octal);
        System.out.println(zeichen);
        System.out.print(tabulator);
        System.out.println(phi);
    }
}