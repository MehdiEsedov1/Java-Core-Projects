import java.util.Scanner;

public class Managment {
    public static void showMenu() {
        System.out.println(
                "\n[0]-->Exit" +
                        "\n[1]-->Add new book" +
                        "\n[2]-->Search for a book" +
                        "\n[3]-->Delete a book" +
                        "\n[4]-->Show all books" +
                        "\n[5]-->Update a book");

        System.out.print("\nYour choise : ");
    }

    public static void options() {
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Operations.addBook();
                break;
            case 2:
                Operations.searchBook();
                break;
            case 3:
                Operations.removeBook();
                break;
            case 4:
                Operations.showAllBooks();
                break;
            case 5:
                Operations.updateBook();
                break;
        }
    }
}