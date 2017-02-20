import java.util.Scanner;

public class Diamond01 {

    private static void printUpperTriangle(int n) {

        for(int i = 1; i <= n; i++) {
            for(int j = n-1; j >= i; j--)
                System.out.print(" ");

            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        printUpperTriangle(n);
    }
}
