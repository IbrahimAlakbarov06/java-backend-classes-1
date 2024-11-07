package az.edu.turing.module1.lesson7;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        String[] names = new String[6];
        names[0] = "T";
        names[1] = "u";
        names[2] = "r";
        names[3] = "i";
        names[4] = "n";
        names[5] = "g";
        String[] names2 = new String[6];

        for (String name : names){
            System.out.println(name);
        }

        /*for (int i = 0; i < names2.length; i++) {
            if (i == 5) {
                names[i] = "sakam";
                break;
            } else {
                names2[i] = names[i];
            }
        }*/
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(names2));
    }
}
