import java.util.Scanner;

public class Soal26 {
    // Tahun kabisat dari n_awal s.d n_akhir yang angka terakhirnya 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int nAwal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int nAkhir = sc.nextInt();

        System.out.println("Tahun kabisat (akhiran 4) dari " + nAwal + " sampai " + nAkhir + ":");
        for (int tahun = nAwal; tahun <= nAkhir; tahun++) {
            boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
            if (kabisat && tahun % 10 == 4) {
                System.out.print(tahun + " ");
            }
        }
        System.out.println();
    }
}
