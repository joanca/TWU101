import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeFactors {
    private static boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;

        int sqrtN = (int)Math.sqrt(n)+1;

        for(int i = 6; i <= sqrtN; i += 6)
            if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
        return true;
    }

    private static void generate(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= n; i++)
            if ((n % i) == 0 && isPrime(i)) list.add(i);

        Collections.sort(list);

        int size = list.size();

        for(int i = 0; i < size; i++) {
            System.out.print(list.get(i));
            if(i == size - 1) System.out.print(".");
            else System.out.print(",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        generate(n);
    }
}
