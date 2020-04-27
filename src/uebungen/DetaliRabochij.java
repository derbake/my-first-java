package uebungen;

/**
 * Created for myFirstProject.
 * Date: 27.04.2020; Time: 11:50
 * Изготавливая по 42 детали в час, рабочий трудился 8 часов.
 * Сколько времени ему понадобилось бы на эту же работу,
 * если бы он делал в час по 48 деталей?
 */
public class DetaliRabochij {
    public static void main(String[] args) {
        int detail = 42;
        int uhr = 8;
        int addDetail = 48;
        findTime(uhr, detail, addDetail);
    }

    private static void findTime(int uhr, int detail, int addDetail) {
        int totalDetail = detail * uhr;
        int findTime = totalDetail / addDetail;
        System.out.println("Общее количество часовы  " + findTime);
    }
}
