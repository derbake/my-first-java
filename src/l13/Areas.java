package l13;

import java.util.Scanner;

/**
 * Created for myFirstProject.
 * Date: 01.04.2020; Time: 10:36
 * Давайте попробуем написать методы для вычисления площади и периметра фигур: квадрата, прямоугольника, треугольника, круга.
 * И один раз напищем их исполняющими, а один раз возвратными.
 * В обеих случаях методы должны принимать необходимые данные для вычисления: как радиус, длину сторон или прочее.
 */
public class Areas {
    public static void main(String[] args) {
        squareArea();
    }

    private static void squareArea() {
        double side1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата");
        side1 = scanner.nextDouble();

        double square = side1 * side1;
        System.out.println("Площадь квадрата равна  " + " " + square);
    }
}

