package lesson8;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lambda {
    public static void main(String[] args) {
        Function<String, Integer> strToLen = String::length;
        Function<String, Integer> strTtoLen = s -> s.length();
        Predicate<Integer> evenNumberFilter = n -> n % 2 == 0;
        Function<Integer, Integer> cube = n -> n * n * n;

        Stream.of(1, 2, 3).map(n -> Math.pow(n, 3));
        Stream.of(1, 2, 3).map(cube);


    }
}
