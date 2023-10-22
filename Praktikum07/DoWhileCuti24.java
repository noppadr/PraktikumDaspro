import java.util.Scanner;

public class DoWhileCuti24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jatahCuti = 14;
        int jumlahHariCuti;
        String lanjut;
        
        do {
            System.out.println("Jatah cuti tersisa: " + jatahCuti + " hari");
            System.out.print("Masukkan jumlah hari cuti yang ingin diambil: ");
            jumlahHariCuti = input.nextInt();

            if (jumlahHariCuti > jatahCuti) {
                System.out.println("jumlah hari cuti melebihi jatah yang tersisa. Mohon masukkan jumlah yang sesuai.");
            } else {
                jatahCuti -= jumlahHariCuti;
                System.out.println("Sisa jatah cuti: " + jatahCuti + "hari");

                System.out.print("Apakah Anda ingin mengambil cuti lagi? (y/t)");
                lanjut = input.next();

                if (!lanjut.equalsIgnoreCase("y")) {
                    break;
                }
            }
        } while (true);
        System.out.println("Terimakasih anda telah mengambil cuti");
    }
}
