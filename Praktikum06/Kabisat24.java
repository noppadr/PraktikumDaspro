import java.util.Scanner;

public class Kabisat24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input.nextInt();

        if ((tahun %4 == 0) && (tahun %100 !=0) || (tahun %4 == 0) && (tahun %100 !=0)) {
            System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");
    }
}
