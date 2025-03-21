import java.util.Scanner;

public class Managment {
    public static void showMenu() {
        System.out.print(
                "\n[0]-->Exit" +
                "\n[1]-->Add new book" +
                "\n[2]-->Search for a book" +
                "\n[3]-->Remove a book" +
                "\n[4]-->Show all books" +
                "\n[5]-->Update a book" +
                "\nYour choise: ");
    }

    public static void options() {
        Operations op = new Operations();

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                op.addBook();
                break;
            case 2:
                op.searchBook();
                break;
            case 3:
                op.removeBook();
                break;
            case 4:
                op.showAllBooks();
                break;
            case 5:
                op.updateBook();
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}