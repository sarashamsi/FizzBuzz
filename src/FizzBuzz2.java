public class FizzBuzz2 {
    public static void main(String[] args) {

        for (int i = 1 ; i <= 100 ; i++)
        {
            var str = "" ;
            if (i % 3 == 0)  str += "Fizz" ;
            if (i % 5 == 0)  str += "Buzz" ;
            System.out.println(str.isEmpty() ? i : str);
        }
    }
}