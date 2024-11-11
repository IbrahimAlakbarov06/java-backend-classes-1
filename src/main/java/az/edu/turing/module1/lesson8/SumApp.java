package az.edu.turing.module1.lesson8;

public class SumApp {
    public static void main(String[] args) {
        int[] nums ={5,6,6};
        int sum = sum(nums);

    }

    public  static int sum(int[] vekil) {
        int sum = vekil[0] + vekil[1];
        return sum;
    }
}
