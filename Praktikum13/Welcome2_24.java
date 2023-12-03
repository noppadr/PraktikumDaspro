import java.util.Scanner;

public class Welcome2_24 {
    
        Scanner sc = new Scanner (System.in);

        public static void displayWelcomeMessage(String name) {
            System.out.println("Selamat datang di Politeknik Negeri Malang, " + name);
        }
        public static void main(String[] args) {
            displayWelcomeMessage(null);
    }
}
