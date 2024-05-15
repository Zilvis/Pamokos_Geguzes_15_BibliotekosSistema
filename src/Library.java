import java.util.Arrays;

public class Library {
    private Book[] bookList;

    public Library(Book[] bookList) {
        this.bookList = bookList;
    }

    private int gautiSarasoIlgi (Book[] bookList){
        int sarasoIlgis = 0;
        for (int i = 0; i < bookList.length; i++){
            if (!bookList[i].getAuthor().isEmpty()){
                sarasoIlgis ++;
            }
        }
        return sarasoIlgis;
    }

    // Prideti knyga i sarasa bet pries tai reikia patikrinti saraso ilgi ir su +1 nustatyti sekancia vieta
    public Book[] addBook(Book book){
        return null;
    }

    private void removeBook(String title){

    }

    private Book findBook(String title){

        return null;
    }

    public void atspauzdinti (Book[] booksList){
        for (int i = 0; i < gautiSarasoIlgi(bookList); i++){
            System.out.println(booksList[i].getTitle() + " " + booksList[i].getAuthor());
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + Arrays.toString(bookList) +
                '}';
    }
}
