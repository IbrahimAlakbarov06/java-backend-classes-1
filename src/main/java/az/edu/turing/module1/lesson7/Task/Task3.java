package az.edu.turing.module1.lesson7.Task;

public class Task3 {
    public static void main(String[] args) {
        String name = "Turing";
        String names = new StringBuilder(name).reverse().toString().toUpperCase();
        System.out.println(names);

        /*String name = "Turing";
        String reversedName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedName += name.charAt(i);
        }
        String reversedUpper = reversedName.toUpperCase();
        System.out.println(reversedUpper);*/
    }
}
