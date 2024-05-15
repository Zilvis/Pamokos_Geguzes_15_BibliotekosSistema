
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Pavadinimas", "Autorius");
        Book book1 = new Book("Kitas", "Autorius");
        Book book2 = new Book("Trecias", "Autorius");
        Book book3 = new Book("Nauja Knyga", "Naujas Autorius");

        Book[] books = new Book[3];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;

        Library library = new Library(books);
        System.out.println("Pradinis sarasas");
        library.atspauzdinti(books);

        System.out.println("\nPrideta knyga");
        books = library.addBook(book3);
        library.atspauzdinti(books);

        System.out.println("\nIstrinta knyga");

        library.atspauzdinti(library.removeBook("Pavadinimas Autorius"));

        System.out.println("\nSurasti knyga");
        System.out.println(library.findBook("Trecias"));

    }
}