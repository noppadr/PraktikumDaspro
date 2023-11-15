import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nama, next;
        int baris, kolom, pilihan;
        String[][]penonton = new String[20][10];

        System.out.println("+------------------------------------+");
        System.out.println("       Selamat Datang di Bioskop      ");
        System.out.println("+------------------------------------+");

            System.out.println("Pilih Menu: ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print ("Pilih menu (1/2/3): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1 :
                    while (true) {
                        System.out.println("Masukkan nama\t: ");
                        nama = sc.nextLine();
                        System.out.println("Masukkan baris\t: ");
                        baris = sc.nextInt();
                        System.out.println("Masukkan kolom\t: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();
            
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
                    break;
            
                default:
                    break;
            }
    }
}
