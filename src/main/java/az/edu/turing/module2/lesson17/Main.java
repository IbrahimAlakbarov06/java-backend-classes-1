package az.edu.turing.module2.lesson17;

public class Main extends Human implements Swimming{
    public Main(String name, int age) {
        super(name, age);
    }

    @Override
    public void foo() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void dive() {
        Swimming.super.dive();
    }
}
