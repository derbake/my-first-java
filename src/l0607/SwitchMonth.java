package l0607;

/**
 * Created for myFirstProject.
 * Date: 17.03.2020; Time: 15:20
 */
public class SwitchMonth {
        public static void main(String[] args) {

            int monthYear = 7;
            String seasonYear = " ";

            switch (monthYear) {
                case 12:
                case 1:
                case 2:
                    seasonYear = "зима";
                    break;
                case 3:
                case 4:
                case 5:
                    seasonYear = "весна";
                    break;
                case 6:
                case 7:
                case 8:
                    seasonYear = "лето";
                    break;
                case 9:
                case 10:
                case 11:
                    seasonYear = "осень";
                    break;
                default:
                    seasonYear = "такого сезона нет";
                    break;
            }
            System.out.println(seasonYear);
        }
    }