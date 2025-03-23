package main.java.org.example;

public class MenuUtil {
    public static void showMenu() {
        System.out.print(
                "\n----------------------\n" +
                "[0]->Exit\n" +
                "[1]->Add car\n" +
                "[2]->Search car\n" +
                "[3]->Show all cars\n" +
                "[4]->Update car\n" +
                "[5]->Delete car\n" +
                "----------------------\n" +
                "Your choice: "
        );
    }
}