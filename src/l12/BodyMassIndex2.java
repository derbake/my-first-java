package l12;

/**
 * Created for myFirstProject.
 * Date: 02.04.2020; Time: 18:09
 */
public class BodyMassIndex2 {
    public static void main(String[] args) {
        System.out.println(BodyMassFind());
    }

    private static double BodyMassFind() {
        double height = 176;
        double weight = 100;

        double bodyMassIndex = (weight / (height * height)) * 10000;

        if (bodyMassIndex <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        } else if (bodyMassIndex > 16 && bodyMassIndex <= 18.5) {
            System.out.println("Недостаточная масса тела");
        } else if (bodyMassIndex > 18.5 && bodyMassIndex <= 25) {
            System.out.println("Норма");
        } else if (bodyMassIndex > 25 && bodyMassIndex <= 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (bodyMassIndex > 30 && bodyMassIndex <= 35) {
            System.out.println("Ожирение");
        } else if (bodyMassIndex > 35 && bodyMassIndex <= 40) {
            System.out.println("Ожирение резкое");
        } else System.out.println("Очень резкое ожирение");

        return bodyMassIndex;
    }
}
