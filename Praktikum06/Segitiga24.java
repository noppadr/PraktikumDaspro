import java.util.Scanner;

public class Segitiga24 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Sudut 1 : ");
        sudut1 = input.nextInt();
        System.out.print("Sudut 2 : ");
        sudut2 = input.nextInt();
        System.out.print("Sudut 3 : ");
        sudut3 = input.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga siku-siku");
            } else if (sudut1 == sudut2 && sudut1 == sudut3 && sudut2 == sudut3) {
                System.out.println("Segitiga sama sisi");
            } else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3) {
                System.out.println("Segitiga sama kaki");
            } else {
                System.out.println("Segitiga sembarang");
            }
        }
        else 
            System.out.println("Bukan segitiga");
    }
}
