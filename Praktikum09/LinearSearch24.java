import java.util.Scanner;

public class LinearSearch24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int key = 0;
        int hasil = -1;

        System.out.print("Masukkan jumlah elemen array: ");
        int elemen = input.nextInt();
        int[] arrayInt = new int[elemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = input.nextInt();        
        }

        System.out.println("Masukkan key yang ingin dicari: ");
        key = input.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;

                System.out.println("key ada dalam array pada posisi indeks ke-" + hasil);
            }
        }

        if (hasil == -1) {
            System.out.println("Key tidak ditemukan dalam array");
        }
        
    }
}
    
