import java.awt.dnd.peer.DragSourceContextPeer;

/**
 * Created for myFirstProject.
 * Date: 12.03.2020; Time: 09:14
 */
public class HelloInteger {
    public static void main(String[] args) {
        //найдем периметр прямоугольника
        int a = 3;
        int b = 6;
        int c = a + b;
        System.out.println("Периметр прямоугольника со сторонами а и b => P " + c * 2);
        //найдем периметр куба
        int f = 4;
        System.out.println("Периметр куба через длину ребра f => P " + f * 12);
        // Площадь ромба
        float d1 = 3.4f;
        float d2 = 7.1f;
        float d3 = d1 * d2;
        System.out.println("Площадь ромба через длину диагоналей d1d2 => S " + d3 / 2);
        // шахматная доска
        int a1 = 2;
        int b1 = 64;
        double k = Math.pow(a1, b1);
        System.out.println("Число 2 в 64 степени равно k  " + k);
        System.out.println("Число зерен на доске равно Т  " + (k - 1));
        //найдем периметр квадрата
        int a2 = 5;
        System.out.println("Периметр квадрата со стороной d => P " + 4 * a2);


    }
}
