public class FizzBuzzExercise {
    private static void FizzBuzz(int n) {
        if((n % 3) == 0 && (n % 5) == 0) System.out.println("FizzBuzz");
        else if((n % 3) == 0) System.out.println("Fizz");
        else if((n % 5) == 0) System.out.println("Buzz");
        else System.out.println(n);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) FizzBuzz(i+1);
    }
}
