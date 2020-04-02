package l12;

import com.sun.org.apache.xpath.internal.objects.XBoolean;
import com.sun.org.apache.xpath.internal.objects.XBooleanStatic;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Created for myFirstProject.
 * Date: 31.03.2020; Time: 16:01
 * Ознакомьтесь с термином - body mass index (BMI) Индекс массы тела .
 * Напишите программу расчёта индекса массы тела.
 */
public class BodyMassIndex {

    public static void main(String[] args) {

        double height;
        double weight;
        // int bodyIndex = weight / (height + height);
//int bodyIndex;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рост, м");
        height = scanner.nextDouble();
        System.out.println("Введите вес в кг");
        weight = scanner.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.println("Индекс массы тела " + bodyMassIndex);

        if (bodyMassIndex <= 16) {
            System.out.println("Выраженный дефицит массы тела");
        } else if (bodyMassIndex > 16 && bodyMassIndex <= 18.5) {
            System.out.println("Недостаточная масса тела");
        } else if (bodyMassIndex > 18.5 && bodyMassIndex <= 25) {
            System.out.println("Норма");
        } else if (bodyMassIndex > 25 && bodyMassIndex <= 30) {
            System.out.println("Избыточная масса тела (предожирение)");
        } else if (bodyMassIndex > 30 && bodyMassIndex <= 35) {
            System.out.println("Ожирение");
        } else if (bodyMassIndex > 35 && bodyMassIndex <= 40) {
            System.out.println("Ожирение резкое");
        } else System.out.println("Очень резкое ожирение");
    }
}

