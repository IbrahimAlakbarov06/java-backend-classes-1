package az.edu.turing.module1.Lesson1;

public class HomeTask2 {

    public static void main(String[] args) {
        int a =5;
        // b, a ile eyni olacaq cunki birinci a oldugu kimi qalir sonra 1 vahid artir.
        int b= a++;
        // c ise a artiq 6 olmusdu ++a olduguna gore bir vahid artacaq ve 7 olacaq.
        int c= ++a;
        System.out.printf("b is equal to:%d\n",b);
        System.out.println("c is equal to:"+c);

        int d=78;
        // d+=4 --> d=d+4 d-ni 4 vahid artiririq.
        d+=4;
        int e=23;
        // e-=6 --> e=e-6 e-ni 6 vahid azaldiriq.
        e-=6;
        System.out.println("d is equal to:"+d);
        System.out.println("e is equal to:"+e);

        int f =14;
        // f-- --> g, ile eyni olacaq daha sonra f bir vahid azalacaq.
        int g= f--;
        // h ise f artiq 13 olmusdu --a olduguna gore bir vahid azalacaq ve 12 olacaq.
        int h= --f;
        System.out.printf("g is equal to:%d\n",g);
        System.out.print("h is equal to:"+h);
    }
}
