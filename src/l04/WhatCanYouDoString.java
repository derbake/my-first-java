/**
 * Created for myFirstProject.
 * Date: 13.03.2020; Time: 10:23
 */
public class WhatCanYouDoString {
    public static void main(String[] args) {
        String name = "AndrejPodlubnyj";
        int dlina = name.length();
        System.out.println(name);
        System.out.println(dlina);

        // вырезать символы с 6-го по 15-ый
        String firstName = name.substring(6,15);

        dlina = firstName.length();
        System.out.println(firstName);
        System.out.println(dlina);
    }
}
