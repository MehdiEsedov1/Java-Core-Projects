package Management;

import java.util.Scanner;

public class Helpers {
    public static int scannerInt(String s) {
        System.out.printf(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String scannerString(String s) {
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}