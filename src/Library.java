import java.util.Arrays;

public class Library {
    private Book[] bookList;

    public Library(Book[] bookList) {
        this.bookList = bookList;
    }

    // Prideti knyga i sarasa bet pries tai reikia patikrinti saraso ilgi ir su +1 nustatyti sekancia vieta
    public Book[] addBook(Book book){
        Book[] naujasMasyvas = Arrays.copyOf(bookList, bookList.length + 1);
        naujasMasyvas[bookList.length] = book;
        bookList = naujasMasyvas;
        return naujasMasyvas;
    }

    public Book[] removeBook(String title){
        int bookId = 0;
        for (int i = 0; i < bookList.length; i++){
            if (bookList[i].getTitle().equalsIgnoreCase(title)){
                bookId = i;
            }
        }
        Book[] naujasMasyvas = new Book[bookList.length - 1];
        System.arraycopy(bookList, 0, naujasMasyvas, 0, bookId);
        System.arraycopy(bookList, bookId + 1, naujasMasyvas, bookId, bookList.length - bookId - 1);

        return bookList = naujasMasyvas;
    }

    public Book findBook(String title){
        int bookId = 0;
        for (int i = 0; i < bookList.length; i++){
            if (bookList[i].getTitle().equalsIgnoreCase(title)){
                bookId = i;
            }
        }

        for (Book b : bookList){
            if (b.getTitle().equalsIgnoreCase(title)){
                return new Book(b.getTitle(),b.getAuthor());
            }
        }

        return null;
    }

    public void atspauzdinti (Book[] booksList){
        for (Book b : booksList){
            System.out.println(b.getTitle() + " " + b.getAuthor());
        }
    }
}
