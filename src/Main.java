
public class Main {
    public static void main(String[] args) {

        Book book = new Book("Pavadinimas", "Autorius");
        Book book1 = new Book("Pavadinimas", "Autorius");
        Book book2 = new Book("Pavadinimas", "Autorius");

        Book[] books = new Book[3];
        books[0] = book;
        books[1] = book1;
        books[2] = book2;

        Library library = new Library(books);
        library.atspauzdinti(books);






//        int masyvoIlgis = 0;
//        for (int i = 0; i < books.length; i++){
//            if (!books[i].getAuthor().isEmpty()){
//                masyvoIlgis ++;
//            }
////            System.out.println(books[i].getAuthor()+ " " + books[i].getTitle());
//        }
//
//        System.out.println(masyvoIlgis);

    }
}