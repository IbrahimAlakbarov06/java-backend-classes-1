package az.edu.turing.module2.lesson12;

public class Film {
    private String name;
    private int year;

    public Film(String name, int year){
        this.name=name;
        this.year=year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }

    public void aboutFilm(){
        System.out.println("Films is so interesting");
    }

    public boolean equals(Object o){
        if (this.name==o) return true;
        if (this.name == null )return false;
        Film film = (Film) o;
        return false ;
    }
}
