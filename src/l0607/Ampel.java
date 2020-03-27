/**
 * Created for myFirstProject.
 * Date: 21.03.2020; Time: 16:22
 */
public class Ampel {

    //Напишите программу для машин на светофорах одного перекрёстка.
    // Что делать если горит красный, жёлтый, зелёный.
    public static void main(String[] args) {
        String color = "yellowBlink";
        if (color == "green") {
            System.out.println("Можно продолжать движение");
        } else if (color == "yellow") {
            System.out.println("Запрещение движения. Ждать смену сигнала");
        } else if (color == "yellowBlink") {
            System.out.println("Движение разрешено, но есть опасность");
        } else {
            System.out.println("Движение запрещено");
        }
        // else
        //fffgyj
    }
}

