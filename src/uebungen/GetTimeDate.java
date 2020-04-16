package uebungen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created for myFirstProject.
 * Date: 15.04.2020; Time: 22:05
 * Посчитать количество дней до нового года и дня рождения Пушкина.
 */
public class GetTimeDate {
    public static void main(String[] args)  {
        String dateCurrent = "16.04.2020";
        String dateEnd = "31.12.2020";
        System.out.println("До нового года:  " + getDayNewYear(dateCurrent, dateEnd));
    }


    private static long getDayNewYear(String dateCurrent, String dateEnd) {

        SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = null;
        Date date2 = null;

        try {
            date1 = formatDate.parse(dateCurrent);
            date2 = formatDate.parse(dateEnd);

            System.out.println(date1);
            System.out.println(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24);


    }


}

