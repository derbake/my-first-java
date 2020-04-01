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
        rectangleArea();
        areaTriangle();
        areaCircle();
    }

    private static void areaCircle() {
        final double PI = 3.14;
        double radius;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус");
        radius = scanner.nextDouble();

        double square = PI * (radius*radius);
        System.out.println("Площадь круга равна  " + " " + square);
    }

    private static void areaTriangle() {
        double base;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите основание треугольника");
        base = scanner.nextDouble();
        System.out.println("Введите высоту треугольника");
        height = scanner.nextDouble();

        double square = 0.5 * (base * height);
        System.out.println("Площадь треугольника равна  " + " " + square);
    }

    private static void rectangleArea() {
        double side1;
        double side2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону прямоугольника");
        side1 = scanner.nextDouble();
        System.out.println("Введите вторую сторону прямоугольника");
        side2 = scanner.nextDouble();

        double square = side1 * side2;
        System.out.println("Площадь прямоугольника равна  " + " " + square);
    }

    private static void squareArea() {
        double side1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата");
        side1 = scanner.nextDouble();

        double square = side1 * side1;
        System.out.println("Площадь квадрата равна  " + " " + square);
//        return "Площадь квадрата равна  " + " " + square;
    }

}

