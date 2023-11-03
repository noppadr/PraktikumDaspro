import java.util.Scanner;

public class LinearSearch24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int[] arrayInt = new int[8];
        int key = 0, hasil = 0, array;

        System.out.print("Masukkan jumlah elemen array: ");
        array = input.nextInt();


        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array yang ke- " +i+ " : ");
                arrayInt[i] = input.nextInt();

            } System.out.print("Masukkan key yang ingin dicari: ");
            key = input.nextInt();
            for (int i =0; i < arrayInt.length; i++){
                if (arrayInt[i] == key){
                    hasil =i;
                    System.out.print("key dalam array pada posisi indeks ke- "+hasil);
                    break;
                } else {
                    System.out.println("key tidak ditemukan");
                    break;
            }
            
        }
    }
}