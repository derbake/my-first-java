package l0607;

/**
 * Created for myFirstProject.
 * Date: 17.03.2020; Time: 16:14
 */
public class AgeAlco {
    public static void main(String[] args) {

        int age = 18;
        String actionKassa = " ";

        switch (age) {
            case 10:
            case 17:
                actionKassa = "Не продавать";
                break;
            case 18:
            case 20:
                actionKassa = "Попросить документы, если соответствует возрасту, то продать";
                break;
            case 30:
                actionKassa = "Можно продавать";
                break;
            default:
                actionKassa = "Спросить документы в любом случае";
                break;
        }
        System.out.println(actionKassa);
    }
}
