package az.edu.turing.module3.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task1 {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            Supplier<List<Integer>> supplier = () -> {
                List<Integer> integers = new ArrayList<>();
                Random random = new Random();
                for (int i = 0; i < 10; i++) {
                    integers.add(random.nextInt(100));
                }
                return integers;
            };

            List<Integer> randomIntegers = supplier.get();
            System.out.println("Random number list: " + randomIntegers);

            Predicate<Integer> isEven = num -> num % 2 == 0;
            Predicate<Integer> isGreater = num -> num > 50;

            List<Integer> filteredList = new ArrayList<>();
            for (Integer number : randomIntegers) {
                if (isEven.test(number) && isGreater.test(number)) {
                    filteredList.add(number);
                }
            }
            System.out.println("Filtered list: " + filteredList);

            List<Integer> squaredList = new ArrayList<>();
            for (Integer number : filteredList) {
                squaredList.add(square(number));
            }

            Consumer<Integer> consumer = System.out::println;
            System.out.println("Squared list:");
            for (Integer squaredNumber : squaredList) {
                consumer.accept(squaredNumber);
            }
        };

        runnable.run();
    }

    public static Integer square(Integer num) {
        return num * num;
    }
}
