package main.java.org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                MenuUtil.showMenu();
                int option = scanner.nextInt();
                MenuService.optionSelector(option);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}