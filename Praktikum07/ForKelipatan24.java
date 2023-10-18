import java.util.Scanner;

public class ForKelipatan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double rataRata;
        int bilangan, total, counter;
        total = 0;
        counter = 0;

        System.out.print("Masukkan bilangan 1-9: ");
        bilangan = input.nextInt();

        for (int i = 0; i < 50; ++i) {
            if (i % bilangan == 0) {
                total += i;
                ++counter;
        
            }
        }
        System.out.printf("pada rentang 1-5 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
        System.out.println(" ");
        rataRata = (double)  total / counter;
        System.out.println("Rata-rata: " + rataRata);
    }
}
