package l10;

import java.util.Scanner;

/**
 * Created for myFirstProject.
 * Date: 26.03.2020; Time: 12:16
 */
public class WhileScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("Сколько тебе лет? ");
        old = input.nextInt();
        if (old >= 18) {
            System.out.println("Ты можешь купить на вечер что-то более крепкое чем чай");
        } else {
            System.out.println("иди домой");
        }
    }
}
