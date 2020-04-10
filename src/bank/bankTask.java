package bank;

/**
 * Created for myFirstProject.
 * Date: 10.04.2020; Time: 11:05
 */
public class bankTask {
    public static void main(String[] args) {
        byte depositAmount = 0;
        byte depositTime = 0;
        System.out.println("Доход за 7 лет составил (евро): " + (float) growthBankDeposit(depositAmount, depositTime))
        ;
       /* System.out.println("Сумма вклада в конце второго года: " + growthBankDeposit(secondYear));
        System.out.println("Сумма вклада в конце NN года: " + growthBankDeposit(seventhYear)); */
    }

    public static int growthBankDeposit(int depositAmount, int depositTime) {
        depositAmount = 100;
        depositTime = 7;
        float depositInterest = (float) 0.023;
        float growthBankDeposit = 0;

        for (int i = 0; i < depositTime; i++) {
            //первый год
            if (i == 0) {
                growthBankDeposit = (float) ((depositAmount) + (depositAmount * depositInterest));
                System.out.println("Сумма вклада в конце первого года: " + growthBankDeposit);
            } else {
                growthBankDeposit = (float) ((growthBankDeposit) + (growthBankDeposit * depositInterest));
            }
            if (i == 1) {
                System.out.println("Сумма вклада в конце второго года: " + growthBankDeposit);
            }
            System.out.println(growthBankDeposit);
        }
      /*  public static int incomeAmountToAccount ( int incomeAmountedTo){
            for (int j = 7; j > 0; j--) {
                //first year
                if (j == 7) {
                    float incomeAmountedTo = (float) (depositAmount * depositInterest);
                    System.out.println(incomeAmountedTo);
                } else {
                    float incomeAmountedTo = 0;
                    incomeAmountedTo = (float) (incomeAmountedTo * depositInterest);
                    System.out.println(incomeAmountedTo);
                }
            }


       }*/
            return (int) ((depositAmount * depositInterest)*depositTime);
    }
}
