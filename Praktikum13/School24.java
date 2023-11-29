import java.util.Scanner;

public class School24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students1A = { "Anne", "Aldrian", "Ali", "Arul", "Ashley" };
        String[] students1B = { "Bobby", "Brian", "Bill" };
        String[] students1C = { "Clara", "Celine", "Charlie", "Caroline" };
        String[] students1D = { "Daniel", "Daisy", "Diana" };

        // 1A
        System.out.printf("-------------------------%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("-------------------------%n");
        
        for (int i = 0; i < students1A.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i + 1), students1A[i]);
        }

        System.out.printf("-------------------------%n%n");
        
        // 1B
        System.out.printf("-------------------------%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("-------------------------%n");
        
        for (int i = 0; i < students1B.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i + 1), students1B[i]);
        }

        System.out.printf("-------------------------%n%n");

        // 1C
        System.out.printf("-------------------------%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("-------------------------%n");
        
        for (int i = 0; i < students1C.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i + 1), students1C[i]);
        }

        System.out.printf("-------------------------%n%n");

        // 1D
        System.out.printf("-------------------------%n");
        System.out.printf("| %-3s | %-15s |%n", "NO", "NAME");
        System.out.printf("-------------------------%n");
        
        for (int i = 0; i < students1D.length; i++) {
            System.out.printf("| %-3d | %-15s |%n", (i + 1), students1D[i]);
        }

        System.out.printf("-------------------------%n%n");
    }

}
