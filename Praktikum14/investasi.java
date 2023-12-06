public class investasi {
        public static double investasiRekursif(double uang, int tahun) {
            if (tahun == 0) {
                return uang;
            } else {
                return investasiRekursif(uang * 1.117, tahun - 1);
            }
        }

        public static double investasiIterative(double uang, int tahun) {
            for (int i = 0; i < tahun; i++) {
                uang = uang * (1.117);
            }
            return uang;
        }
         public static void main(String[] args) {
            double uang = 1000000;
            int tahun = 10;

            double hasilRekursif = investasiRekursif(uang, tahun);
            System.out.println("Hasil investasi emas setelah " + tahun + " tahun (Rekursif) adalah " + hasilRekursif);
            double hasilIterative = investasiIterative(uang, tahun);
            System.out.println("Hasil investasi emas setelah " + tahun + " tahun (Iterative) adalah " + hasilIterative);

        }
    }


    


    
