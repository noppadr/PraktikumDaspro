import java.util.Scanner;

public class NestedLoop24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = input.nextInt();
        double[][] suhu = new double[jumlahKota][4];

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("KOTA KE-" + (i + 1));

            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("  Suhu ke-" + (j + 1) + ": ");
                suhu[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("KOTA KE-" + (i + 1) + ": ");

            for (double temperature : suhu [i]) {
                System.out.print(temperature + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < suhu.length; i++) {
            double totalSuhu = 0;
            for (int j = 0; j < suhu[i].length; j++) {
                totalSuhu += suhu[i][j];
            }
            double rataRata = totalSuhu / suhu[i].length;
            System.out.println("Rata-rata suhu kota " + (i +1) + ": " + rataRata);
        }
    }
}
