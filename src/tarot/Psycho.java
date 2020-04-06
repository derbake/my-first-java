package tarot;

/**
 * Created for myFirstProject.
 * Date: 05.04.2020; Time: 22:58
 */
public class Psycho {
    public static void main(String[] args) {
        int date = 13;
        int month = 1;
        int year1 = 1;
        int year2 = 9;
        int year3 = 6;
        int year4 = 2;
        int add = 22;
        int yearSumme = year1 + year2 + year3 + year4;

        int z = findLifeWay(date, month, yearSumme, add);
        int huint = humanPsyche(date, month, z, add);
        System.out.println("6CA:" + huint);
        outerCircle();
    }

    private static int findLifeWay(int date, int month, int yearSumme, int add) { // 1.2.3

        int position1 = date;
        int position2 = month;
        int position3 = yearSumme;
        int positionAdd = yearSumme - add;
        if (yearSumme >= 22) {
            System.out.println("3CA:" + position3);
        } else {
            System.out.println("add 3CA:" + positionAdd);
        }
        System.out.println("1СА:" + position1 + " " + " 2СА:" + position2 + " " + " 3СА (<=22):" + position3);
        System.out.println("1СА:" + position1 + " " + " 2СА:" + position2 + " " + " 3СА (>=22):" + positionAdd);

        if (yearSumme >= 22) {
            return positionAdd;
        } else {
            return position3;
        }
    }

    private static int humanPsyche(int position1, int position2, int position3, int add) { // 4.5.6
        int fearsAndComplexes04 = position1 + position2;
        int humanRealm05 = position2 + position3;
        int hiddenTalents06 = fearsAndComplexes04 + humanRealm05;
        int hiddenTalents061 = hiddenTalents06 - add;
        System.out.println("4CА:" + "" + fearsAndComplexes04 + "  " + "5СА:" + "  " + humanRealm05 + "  " + "6CA:" + hiddenTalents06);

        if (hiddenTalents06 >= 22) {
            return hiddenTalents061;
        } else {
            return hiddenTalents06;
        }
    }

    private static void outerCircle() { // 7-14
    }

}
