package l10;

import java.util.Scanner;

/**
 * Created for myFirstProject.
 * Date: 30.03.2020; Time: 17:15
 */
public class ScannerMua {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cart;
        System.out.println("Какой номер у карты ");
        cart = input.nextInt();
        if (cart >= 36) {
            System.out.println("Отчитай сверху колоды соответствующее число и положи на позицию");
        } /*else {
            System.out.println("просчитай заново от начала колоды");
        }*/
        System.out.println("Сколько карт у тебя на позиции");
        int position;
        position = input.nextInt();
        System.out.println("Добавь к  " + position + " третью");
        String number;
        System.out.println("Сложи числовые суммы всех двух карт");
        number = input.next();
        System.out.println("Развитие ситуации " + number);


    }

}
