import java.util.Scanner;

public class DoWhileCuti24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti : ");
        jatahCuti = input.nextInt();

        do {
            System.out.println("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = input.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("jumlah hari : ");
                jumlahHari = input.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else if (jatahCuti == 0){
                    break;
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi. Sisa jatah anda adalah: " + jatahCuti);
                }
            } 
        } while (jatahCuti>0);
    }
} 
    
