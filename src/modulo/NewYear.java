package modulo;

/**
 * Created for myFirstProject.
 * Date: 30.03.2020; Time: 16:43
 */
public class NewYear {
    public static void main(String[] args) {

        int year = 2019;
        int var1 = 400;
        int var2 = 4;
        int var3 = 100;

        if ((year % var2 == 0) || (year % var2 == 0 && year % var1 == 0) || (year % var2 == 0 && year % var3 != 0)) {
            System.out.println("Високосный год");
        }
else {
            System.out.println("Не високосный год");
        }

        /*for (int i = 2000; i < year; i++) {
            int newyear1;
            int newyear2;
            newyear1 = i / var1;
            newyear2 = i / var2;
            if (newyear1 > 5 && newyear2 > 500) {
                System.out.println(i);
            }
         */


    }

}
