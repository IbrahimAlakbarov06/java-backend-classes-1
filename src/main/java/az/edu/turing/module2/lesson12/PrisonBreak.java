package az.edu.turing.module2.lesson12;

public class PrisonBreak extends Film {
    private String senaryo;

    public PrisonBreak(String name, int year, String senaryo){
        super(name, year);
        this.senaryo=senaryo;
    }
    public String getSenaryo(){
        return senaryo;
    }
    public void setSenaryo(String senaryo){
        this.senaryo=senaryo;
    }

    public void aboutFilm(){
        System.out.println("in Prison Break Michael run away");
    }
}
