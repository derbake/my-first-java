package l0607;

/**
 * Created for myFirstProject.
 * Date: 21.03.2020; Time: 00:28
 */
public class SpeedPolice {

    // Напишите программу действий для сотрудника дорожной полиции, который остановил машину.
    // При езде до 50км/час нарушений нет;
    //за езду от 50км/час до 65км/час устное порицание и лекция на 5 минут;
    // за превышение скорости от 16км/час - 40 евро штрафа; !!!!
    //за езду от 100км/час до 130км/час - штраф 500 евро;
    // и за езду свыше 130км/час - штраф в 1000 евро, забирание прав + на 3 года и конфискация транспортного средства.
    public static void main(String[] args) {
        int speed = 190;
        if (speed < 50) {
            System.out.println(" Нарушений нет");
        } else if (speed > 50 && speed < 65) {
            System.out.println("устное порицание и лекция на 5 минут");
        } else if (speed > 100 & speed < 150) {
            System.out.println("штраф 500 евро");
        } else if (speed > 130) {
            System.out.println("штраф в 1000 евро, забирание прав + на 3 года и конфискация транспортного средства");
        } else {
            // ujdyj
        }
    }
}
