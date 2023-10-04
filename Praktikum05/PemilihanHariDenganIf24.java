import java.util.Scanner;

public class PemilihanHariDenganIf24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        String Weekday, Weekend;

        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

    if (angka>0 && angka <=5) {
        System.out.println("Weekday");
    } else if (angka==6 || angka==7 ) {
        System.out.println("Weekend");
    } else {
        System.out.println("Invalid Number");
    }
        
    }
}   
    

