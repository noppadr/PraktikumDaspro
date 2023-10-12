import java.util.Scanner;

public class KabisatNested24_pertama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan Tahun : ");
        tahun = input.nextInt();

        if (tahun % 4 == 0 && tahun % 400 == 0) {
            System.out.println("Tahun " + tahun + " tahun kabisat");
        } 
        else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
