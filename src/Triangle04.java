import java.util.Scanner;

public class Triangle04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int asterisks = 1;
        int j = asterisks;

        for(int i = 0; i < n; i++) {
            while(j > 0) {
                System.out.print("*");
                j--;
            }
            asterisks++;
            j = asterisks;
            System.out.println();
        }

    }
}
