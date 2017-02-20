import java.util.Scanner;

public class Diamond02 {
    private static void printUpperTriangle(int n) {

        for(int i = 1; i <= n; i++) {
            for(int j = n-1; j >= i; j--)
                System.out.print(" ");

            for(int k = 1; k <= 2*i-1; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    private static void printLowerTriangle(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = n; j >= i; j--)
                System.out.print(" ");

            for(int k = 2*i-1; k > 0; k--)
                System.out.print("*");

            System.out.println();
        }
    }

    private static void printDiamond(int n) {
        printUpperTriangle(n);
        printLowerTriangle(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printDiamond(n);
    }
}
