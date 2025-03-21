import java.util.Scanner;

public class Operations {
    Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.print("\nCount of new books: ");
        int countOfBooks = scanner.nextInt();

        for (int i = 0; i < countOfBooks; i++) {
            Book book = new Book();

            System.out.print("Name of book: ");
            String nameOfBook = scanner.next();
            book.setName(nameOfBook);

            System.out.print("Author of book: ");
            String authorOfBook = scanner.next();
            book.setAuthor(authorOfBook);

            System.out.print("Price of book: ");
            int priceOfBook = scanner.nextInt();
            book.setPrice(priceOfBook);

            BookStorage.books.add(book);
        }
    }

    public void showAllBooks() {
        for (int i = 0; i < BookStorage.books.size(); i++) {
            System.out.println("\n-----------------\nName of book: " + BookStorage.books.get(i).getName());
            System.out.println("Author of book: " + BookStorage.books.get(i).getAuthor());
            System.out.println("Price of book: " + BookStorage.books.get(i).getPrice());
            System.out.println("ID: " + BookStorage.books.indexOf(BookStorage.books.get(i)) + "\n-----------------");
        }
    }

    public void removeBook() {
        System.out.println("\nGive a ID: ");
        int idOfBook = scanner.nextInt();

        BookStorage.books.remove(idOfBook);
    }

    public void searchBook() {
        System.out.println("Give a ID: ");
        int idOfBook = scanner.nextInt();

        System.out.println("\n-----------------\nName : " + BookStorage.books.get(idOfBook).getName());
        System.out.println("Author : " + BookStorage.books.get(idOfBook).getName());
        System.out.println("Price : " + BookStorage.books.get(idOfBook).getName());
        System.out.println("ID : " + BookStorage.books.indexOf(BookStorage.books.get(idOfBook)) + "\n-----------------");
    }

    public void updateBook() {
        System.out.print("\nGive a ID: ");
        int idOfBook = scanner.nextInt();

        Book newBook = new Book();

        System.out.print("Name of book: ");
        String nameOfBook = scanner.next();
        newBook.setName(nameOfBook);

        System.out.print("Author of book: ");
        String authorOfBook = scanner.next();
        newBook.setAuthor(authorOfBook);

        System.out.print("Price of book: ");
        int priceOfBook = scanner.nextInt();
        newBook.setPrice(priceOfBook);

        BookStorage.books.set(idOfBook, newBook);
    }
}