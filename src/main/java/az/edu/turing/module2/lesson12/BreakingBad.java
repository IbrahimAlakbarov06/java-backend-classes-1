package az.edu.turing.module2.lesson12;

public class BreakingBad extends Film{
    private String senaryo;

    public BreakingBad(String name, int year, String senaryo){
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
        System.out.println("Breaking is about drugs");
    }
}
