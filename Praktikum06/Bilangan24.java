    import java.util.Scanner;

public class Bilangan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bil1,bil2, bil3;
        int bilBesar;

        System.out.println("Masukkan bilangan 1 : ");
        bil1 = input.nextInt();
        System.out.println("Masukkan bilangan 2 : ");
        bil2 = input.nextInt();
        System.out.println("Masukkan bilangan 3 : ");
        bil3 = input.nextInt();

        String result = (int bil1 >= bil2) (int bil1 >= bil3) ? "Bilangan terbesar: " + bil1 : "Bilangan terbesar: " + bil2;

    }
}
