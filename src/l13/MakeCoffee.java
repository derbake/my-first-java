package l13;

/**
 * Created for myFirstProject.
 * Date: 02.04.2020; Time: 10:42
 * исполняющий метод
 */
public class MakeCoffee {
    public static void main(String[] args) {
        getMeACoffee();
    }

    private static void getMeACoffee() {
        //кофеварка, фильтр, кофе, вода, чашка, молоко, сахар
        //1 метод кофеварка: налить воду и поставить фильтр.
        //2метод: налить готовое кофе в чашку, добавить молоко и сахар
        brewCoffee();
    }

    private static void brewCoffee() {
        System.out.println("Возьми воду, налей ее в кофеварку, поставь фильт номер 4, насыпь в него 78 гр.кофе ");
        System.out.println("После того, как крфе приготовилось возми 250 гр чашку и заполни ее на 3/4 кофе");
        getCoffeeCup();
    }

    private static void getCoffeeCup() {
        System.out.println("Добавь лве ложки сахара и 30 гр молока или сливок. Размешай и подай.");
    }
}
