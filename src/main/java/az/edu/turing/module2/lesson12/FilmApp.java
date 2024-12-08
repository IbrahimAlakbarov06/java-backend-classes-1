package az.edu.turing.module2.lesson12;

public class FilmApp {
    public static void main(String[] args) {
        Film film = new Film("Vikings", 2005);
        Twd film1 = new Twd("The Walking Dead", 2010 , "Zombies");
        PrisonBreak film2 = new PrisonBreak("Prison Break", 2005 , "run away");
        BreakingBad film3 = new BreakingBad("Breaking Bad", 2017, "Chemiker");
        film3.aboutFilm();
    }
}
