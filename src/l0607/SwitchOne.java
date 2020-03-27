/**
 * Created for myFirstProject.
 * Date: 17.03.2020; Time: 13:33
 */
public class SwitchOne {
    public static void main(String[] args) {

        int оценкаВЧетверти = 5;
        String награда = " ";

        switch (оценкаВЧетверти) {
            case 5:
                награда = "dtkjcbgtl";
                System.out.println("dtkjcbgtl");
                System.out.println("tot dtkjcbgtl");
                break;
            case 4:
                награда = "GoPro4";
                break;
            case 3:
                награда = "Награды не будет";
                break;
            case 2:
                награда = "Потерянный час времени и плохое настроение";
                break;
            case 1:
                награда = "По грибам";
                break;
            default:
                награда = "Такой оценки не существует";
                break;
        }
        System.out.println(награда);
    }
}
