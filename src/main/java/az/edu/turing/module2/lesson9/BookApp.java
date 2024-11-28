package az.edu.turing.module2.lesson9;

public class BookApp {
    String name;
    String director;
    int page;

    public BookApp(String name, String director, int page){
        this.name=name;
        this.director=director;
        this.page=page;
    }
    public static void printBook(String name, String director, int page){
        System.out.println(name);
    }
}
