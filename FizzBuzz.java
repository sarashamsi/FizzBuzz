
public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    public static String fizzBuzz(int number) {
        String res = "";
        if (number % 3 == 0) res += "Fizz";
        if (number % 5 == 0) res += "Buzz";
        return res.isEmpty() ? String.valueOf(number) : res;
    }


}