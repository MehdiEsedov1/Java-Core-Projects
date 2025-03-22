package main.java.org.example;

import java.util.Scanner;

public class InputUtil {
    public static int inputInt(String content) {
        System.out.print(content);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String inputString(String content) {
        System.out.print(content);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}