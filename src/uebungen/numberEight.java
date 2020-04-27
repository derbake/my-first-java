package uebungen;

/**
 * Created for myFirstProject.
 * Date: 27.04.2020; Time: 18:03
 * Hа одной из сцепляющих шестерен 32 зубца, а на другой – 40.
 * Сколько оборотов сделает вторая шестерня, в то время как первая сделает 215 оборотов?
 */
public class numberEight {
    public static void main(String[] args) {
        int gear = 32;
        int gear2 = 40;
        int turn = 215;
        howManyTurn(gear, gear2, turn);
    }

    private static void howManyTurn(int gear, int gear2, int turn) {
        int howManyTurn = gear2 * turn / gear;
        System.out.println("Вторая шестерня делает  " + howManyTurn + " " + "оборотов");
    }
}