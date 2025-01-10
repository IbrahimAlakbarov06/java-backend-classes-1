package az.edu.turing.module2.lesson17;

import java.util.Objects;

public class Anima {
    private String kind;

    public Anima(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anima anima = (Anima) o;
        return Objects.equals(kind, anima.kind);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kind);
    }

    @Override
    public String toString() {
        return "Anima{" +
                "kind='" + kind + '\'' +
                '}';
    }
}
