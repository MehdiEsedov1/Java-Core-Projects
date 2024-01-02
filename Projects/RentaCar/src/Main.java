import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                while (true) {
                    Scanner scanner = new Scanner(System.in);
                    MenuUtil.showMenu();
                    System.out.print("Your Choice :");
                    int option = scanner.nextInt();
                    MenuService.optionSelector(option);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}