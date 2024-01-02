package util;

import java.util.Scanner;

public class InputUtil {

    private static InputUtil instance;

    public Integer inputTypeInteger(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        return scanner.nextInt();
    }
}