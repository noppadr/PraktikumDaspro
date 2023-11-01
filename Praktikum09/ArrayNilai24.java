import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nilaiTertinggi = 0;
        int nilaiTerendah = 100;
        int[]  nilaiAkhir = new int[10];
        double totalLulus = 0, totalTdkLulus = 0, rataLulus, rataTdkLulus;
        int lulus = 0, tidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70) {
                totalLulus = totalLulus + nilaiAkhir[i];
                lulus++;
            } else {
                totalLulus = totalTdkLulus + nilaiAkhir[i];
                tidakLulus++;
            }
        }

        rataLulus = totalLulus / lulus;
        rataTdkLulus = totalTdkLulus / tidakLulus;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata tidak lulus " + rataTdkLulus);
    }
}
