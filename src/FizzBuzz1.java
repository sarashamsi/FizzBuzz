public class FizzBuzz1 {
    public static void main (String[] args) {
        for (int i = 1 ; i<= 100 ; i++) {
            System.out.println(FizzBuzz(i));
        }
    }
    public static String FizzBuzz(int i) {
        var str = "" ;
        if ( i % 3 == 0) str += "Fizz" ;
        if ( i % 5 == 0) str += "Buzz" ;
        return str.isEmpty() ? String.valueOf(i) : str ;
    }
}
