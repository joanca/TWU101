import java.util.Scanner;

public class Diamond03 {
    private static void printUpperTriangle(int n) {

        for(int i = 1; i <= n-1; i++) {
            for(int j = n-1; j >= i; j--)
                System.out.print(" ");

            for(int k = 1; k <= 2*i-1; k++)
                System.out.print("*");

            System.out.println();
        }
        System.out.println("JC");
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

    private static void printDiamondWithName(int n) {
        printUpperTriangle(n);

        //System.out.println("JC");

        printLowerTriangle(n - 1);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printDiamondWithName(n);
    }
}
