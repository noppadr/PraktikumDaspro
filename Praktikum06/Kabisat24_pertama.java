import java.util.Scanner;

public class Kabisat24_pertama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tahun;

        System.out.println("Masukkan Tahun Kabisat: ");
        tahun = input.nextInt();

        if ((tahun %400) ==0 ){
            System.out.print("Tahun Kabisat");
        } else if ((tahun % 100) == 0) {
            System.out.println("Bukan Tahun Kabisat");
        } else if ((tahun %4) == 0) {
            System.out.println("Tahun Kabisat");
        } else
        System.out.println("Bukan Tahun Kabisat");
        }
        }

    

