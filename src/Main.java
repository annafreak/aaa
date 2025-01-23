


import java.util.ArrayList;
class Library{

    ArrayList<String> books = new ArrayList<String>();



    public void addBook(String bookTitle) {
        books.add(bookTitle);
        System.out.println("dodawanie ksiazek...");
        System.out.println("ksiazka " + bookTitle+"zostala dodana");
    }

    public void displayBooks(){
        System.out.println("wyswietlanie ksiazek");
        System.out.println(books);
    }
    public void searchBook(String bookTitle){
        if(books.contains(bookTitle)){
            System.out.println( bookTitle +"ksiazka istnieje");
        }else{
            System.out.println(bookTitle + " ksiazka nie istnieje");
        }
    }
    public void removeBook(String bookTitle){
        books.remove(bookTitle);


    }

    public void countBooks(){
        System.out.println("liczba ksiazek " + books.size());
    }
    public static void welcomeMessage(){
        System.out.println("Welcome to the Library");
    }



}


public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.welcomeMessage();
        library.addBook("ok ");
        library.addBook("ok1 ");
        library.addBook("ok2 ");
        library.displayBooks();
        library.removeBook("ok1 ");
        library.displayBooks();
        library.searchBook("dsdsdd");
    }

}
