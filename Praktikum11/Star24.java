import java.util.Scanner;

public class Star24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah * : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
}
