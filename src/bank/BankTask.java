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
        double depositAmount = 1000.0;
        int depositTime = 7;
        double depositInterest = 2.3;
        growthBankDeposit(depositAmount, depositTime, depositInterest);
    }

    public static void growthBankDeposit(double depositAmount, int depositTime, double depositInterest) {
        double profitForAllYears = 0.0;
        depositInterest = depositInterest / 100;
        double summe = depositAmount;

        for (int i = 1; i <= depositTime; i++) {
            summe = summe + summe * depositInterest;
            System.out.println("Сумма вклада в конце " + i + "-го года  " + summe);
        }
        
        profitForAllYears = summe - depositAmount;
        System.out.println("-----");
        System.out.println("Доход за все годы " + depositTime + " составил: " + profitForAllYears);
    }
}
