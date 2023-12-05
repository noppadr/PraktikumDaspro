import java.util.Scanner;

public class TgsIndividu24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah minggu: ");
        int jumlahMinggu = sc.nextInt();

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        int[][] nilai = new int[jumlahMinggu][jumlahSiswa];

        for (int i = 0; i < jumlahMinggu; i++) {
            for (int j = 0; j < jumlahSiswa; j++) {
                System.out.println("Masukkan nilai untuk minggu ke-" + (i + 1) + " dan siswa ke-" + (j + 1));
                nilai[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        tabelNilai();
        for (int i = 0; i < jumlahMinggu; i++) {
            System.out.printf("| %-5s | %-10s | %-10s%n", (i + 1));
            for (int j = 0; j < jumlahSiswa; j++) {
            System.out.printf("| %-5s | %-15s | %-10s%n", nilai[i][j]);}
        }
        System.out.println("-----------------------------------------------------");
    }
    public static void tabelNilai() {
        System.out.println(
            "-----------------------------------------------------");
        System.out.printf("| %-5s | %-10s | %-10s%n", 
        "NO", "MINGGU", "NILAI");
        System.out.println(
            "-----------------------------------------------------%n");

    }
}
