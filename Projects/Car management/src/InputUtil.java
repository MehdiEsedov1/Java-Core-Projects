import java.util.Scanner;

public class InputUtil {
    public static int inputInt(String content) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(content);
        return scanner.nextInt();
    }

    public static String inputString(String content) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(content);
        return scanner.next();
    }
}