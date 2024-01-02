import java.util.Scanner;

public class Operations {
    public static void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Count of new books : ");
        int countOfBooks = scanner.nextInt();

        for (int i = 0; i < countOfBooks; i++) {
            Book book = new Book();

            System.out.println("Name of book : ");
            String nameOfBook = scanner.next();
            book.setName(nameOfBook);

            System.out.println("Author of book : ");
            String authorOfBook = scanner.next();
            book.setAuthor(authorOfBook);

            System.out.println("Price of book : ");
            int priceOfBook = scanner.nextInt();
            book.setPrice(priceOfBook);

            GlobalValues.books.add(book);
        }
    }

    public static void showAllBooks() {
        for (int i = 0; i < GlobalValues.books.size(); i++) {
            System.out.println("\n-----------------\nName of book :" + GlobalValues.books.get(i).getName());
            System.out.println("Author of book :" + GlobalValues.books.get(i).getAuthor());
            System.out.println("Price of book : " + GlobalValues.books.get(i).getPrice());
            System.out.println("ID : " + GlobalValues.books.indexOf(GlobalValues.books.get(i)) + "\n-----------------\n");
        }
    }

    public static void removeBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a ID : ");
        int idOfBook = scanner.nextInt();

        GlobalValues.books.remove(idOfBook);
    }

    public static void searchBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a ID : ");
        int idOfBook = scanner.nextInt();

        System.out.println("\n-----------------\nName : " + GlobalValues.books.get(idOfBook).getName());
        System.out.println("Author : " + GlobalValues.books.get(idOfBook).getName());
        System.out.println("Price : " + GlobalValues.books.get(idOfBook).getName());
        System.out.println("ID : " + GlobalValues.books.indexOf(GlobalValues.books.get(idOfBook)) + "\n-----------------\n");
    }

    public static void updateBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a ID : ");
        int idOfBook = scanner.nextInt();

        Book newBook = new Book();

        System.out.println("Name of book : ");
        String nameOfBook = scanner.next();
        newBook.setName(nameOfBook);

        System.out.println("Author of book : ");
        String authorOfBook = scanner.next();
        newBook.setAuthor(authorOfBook);

        System.out.println("Price of book : ");
        int priceOfBook = scanner.nextInt();
        newBook.setPrice(priceOfBook);

        GlobalValues.books.set(idOfBook, newBook);
    }
}