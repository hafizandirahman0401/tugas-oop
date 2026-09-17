import java.util.Scanner;

public class Soal28 {
    // Tahun kabisat dari n_awal s.d n_akhir yang angka terakhirnya 8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int nAwal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int nAkhir = sc.nextInt();

        System.out.println("Tahun kabisat (akhiran 8) dari " + nAwal + " sampai " + nAkhir + ":");
        for (int tahun = nAwal; tahun <= nAkhir; tahun++) {
            boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
            if (kabisat && tahun % 10 == 8) {
                System.out.print(tahun + " ");
            }
        }
        System.out.println();
    }
}
