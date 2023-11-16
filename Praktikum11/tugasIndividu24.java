import java.util.Scanner;

public class tugasIndividu24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        if (n % 2 == 0 || n <= 2) {
            System.out.println("input tidak valid");
        } else {
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i > 1 && i < n && j > 1 && j < n) {
                    System.out.print("  ");
                } else {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}
