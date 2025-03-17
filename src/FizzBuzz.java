import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> {
                    String result = "";
                    if (i % 3 == 0) result += "Fizz";
                    if (i % 5 == 0) result += "Buzz";
                    return result.isEmpty() ? String.valueOf(i) : result;
                })
                .forEach(System.out::println);
    }
}