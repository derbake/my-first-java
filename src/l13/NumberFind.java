package l13;

/**
 * Created for myFirstProject.
 * Date: 01.04.2020; Time: 15:10
 * Даны натуральные числа от a = 35 до b = 87. Вывести на консоль те из них,
 * которые при делении на 7 дают остаток 1, 2 или 5. а и b должны приниматься методом.
 * ПРИНИМАЮЩИЙ МЕТОД
 */
public class NumberFind {
    public static void main(String[] args) {
        int numberA = 35;
        int numberB = 87;
        findNumber(numberA, numberB);
    }

    private static void findNumber(int numberA, int numberB) {
        int div = 7;
        int mod1 = 1;
        int mod2 = 2;
        int mod3 = 5;

        for (int i = numberA; i < numberB; i++) {
            int remainder = i % div;
            //System.out.println(remainder);
            if (remainder == mod1 || remainder == mod2 || remainder == mod3)
                System.out.println(i + " " + remainder);
        }
    }
}