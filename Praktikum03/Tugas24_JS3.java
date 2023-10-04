import java.util.Scanner;

public class Tugas24_JS3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int saldo,tarik,setor,pilihan;
        saldo=50000000;

            System.out.print("Masukkan Pin Anda : ");
            int pin = input.nextInt();

            System.out.println("===SELAMAT DATANG DI ATM===");
            System.out.println("Menu Pilihan : ");
            System.out.println("1. cek saldo");
            System.out.println("2. tarik tunai");
            System.out.println("3. setor tunai");
            System.out.println("4. keluar");
            System.out.println("Masukkan Menu Pilihan Anda : ");
            pilihan=input.nextInt ();

            if(pilihan==1) {
                System.out.println("===CEK SALDO===");
                System.out.println("saldo anda : "+saldo);
            }     
            if(pilihan==2) {
                System.out.println("==TARIK TUNAI==");
                System.out.println("masukkan jumlah uang yang akan di tarik : ");
                tarik=input.nextInt ();
                if(tarik<=50000) {
                    System.out.println("nominal yang anda masukkan salah");
                }
                if(tarik>=saldo) {
                    System.out.println("maaf, saldo anda tidak mencukupi");
                }
                else{
                    System.out.println("penarikan anda berhasil,sebanyak : "+saldo);
                    saldo=saldo-tarik;
                    System.out.println("saldo anda : "+saldo);
                }
            }
                else if(pilihan==3) {
                    System.out.println("==SETOR TUNAI==");
                    System.out.println("masukkan jumlah uang yang akan disetor : ");
                    setor=input.nextInt ();
                    saldo=saldo+setor;
                    System.out.println("saldo anda : "+saldo);
                }
                else{
                    System.exit(0);
            }
         }       
    }   

