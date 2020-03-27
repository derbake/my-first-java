package l0607;

/**
 * Created for myFirstProject.
 * Date: 17.03.2020; Time: 20:22
 */
public class SummaPhone {
    public static void main(String[] args) {

        // написать прог., вчисляющую стоимость 10-минутного разговора в зависимости от кода города.
        //Москва (495) - 4.15, Ростов (194) - 1.98, Берлин (4930) - 5,98, Минск (375) - 4,28.

        int codeCity = 194;
        String price = "  ";
        double sum = 0;
        switch (codeCity) {
            case 495:
                sum = 4.15 * 10;
                price = new Double(sum).toString();
                break;
            case 194:
                sum = 1.98 * 10;
                price = new Double(sum).toString();
                break;
            case 4930:
                sum = 5.95 * 10;
                price = new Double(sum).toString();
                break;
            case 375:
                sum = 4.28 * 10;
                price = new Double(sum).toString();
                break;
            default:
                price = "такого кода города нет";
                break;
        }
        System.out.println(price);
    }
}
