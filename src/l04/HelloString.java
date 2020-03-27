/**
 * Created for myFirstProject.
 * Date: 13.03.2020; Time: 10:16
 */
public class HelloString {
    public static void main(String[] args) {
        String firstName = "Andrej";
        String secondName = "Podlubnyj";
        char copyright = '\u00A9';
        int old = 18;
        String copyright2 = "©";
        System.out.println(firstName + " " + secondName + " " + old + copyright2);
        String student = firstName + " " + secondName + " " +  copyright;
        System.out.println(student);
    }
}
