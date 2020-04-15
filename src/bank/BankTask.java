package bank;

/**
 * Created for myFirstProject.
 * Date: 10.04.2020; Time: 11:05
 * Написать программу расчёта роста денежного клада в банке.
 * Сумма вклада 100€, время вклада 7 лет, процент дохода вклада 2,3%.
 * Вывести результат на экран за каждый год в виде:
 * Сумма вклада в конце первого года = a
 * Сумма вклада в конце второго года = b
 * Сумма вклада в конце NN года = c
 * Доход за Y лет составил = d
 * При расчёте пользоваться float и ответить на следующие вопросы:
 * Используя какие типы данных можно решить эту задачу? Почему? Что произойдёт при использовании типа данных byte?
 * Решите предыдущую задачу если банк выплачивает проценты на проценты.
 */
public class BankTask {
    public static void main(String[] args) {
        int depositAmount = 100;
        int depositTime = 7;
        double depositInterest = 2.3;
        System.out.println("Доход за 7 лет составил (евро): " + growthBankDeposit(depositAmount, depositTime, depositInterest));
    }

    public static double growthBankDeposit(int depositAmount, int depositTime, double depositInterest) {
        double growthBankDeposit = 0.0;
        double incomeSevenYears = 0.0;
        depositInterest = depositInterest / 100;
        
        for (int i = 0; i < depositTime; i++) {
            //первый год
            if (i == 0) {
                growthBankDeposit = (float) ((depositAmount) + (depositAmount * depositInterest));
                System.out.println("Сумма вклада в конце первого года: " + growthBankDeposit);

                float incomeAmountedTo = (float) (depositAmount * depositInterest);
                incomeSevenYears = incomeSevenYears + incomeAmountedTo;
                int z = i + 1;
                System.out.println("Проценты за год вклада: " + "Номер года: " + z + " " + incomeAmountedTo);
            } else {
                float incomeAmountedTo = (float) (growthBankDeposit * depositInterest);
                incomeSevenYears = incomeSevenYears + incomeAmountedTo;
                int z = i + 1;
                System.out.println("Проценты за год вклада: " + "Номер года: " + z + " " + incomeAmountedTo);

                growthBankDeposit = (float) ((growthBankDeposit) + (growthBankDeposit * depositInterest));
            }
            if (i == 1) {
                System.out.println("Сумма вклада в конце второго года: " + growthBankDeposit);
            }
            System.out.println(growthBankDeposit);
        }
        return incomeSevenYears;
    }
}
