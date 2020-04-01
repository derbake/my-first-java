package l13;

import java.util.Scanner;

/**
 * Created for myFirstProject.
 * Date: 01.04.2020; Time: 14:07
 */
public class Areasss {
    public static void main(String[] args) {
        squareArea();
        System.out.println(squareArea3());
    }

    // один раз напищем их исполняющими.
    private static void squareArea() {
        double side1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата");
        side1 = scanner.nextDouble();

        double square = side1 * side1;
        System.out.println("Площадь квадрата равна  " + square);
    }

    // один раз напищем их возвратными.
    private static double squareArea3() {
        double side1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата");
        side1 = scanner.nextDouble();

        double square = side1 * side1;
        return square;
    }
/*
    public static int squareArea2(int side1) {
        int square = side1*side1;
        return square;
    } */
}
