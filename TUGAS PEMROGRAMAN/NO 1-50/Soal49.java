import java.util.Scanner;

public class Soal49 {
    // Menampilkan bilangan PRIMA dari n_awal s.d n_akhir
    static boolean isPrima(int angka) {
        if (angka < 2) return false;
        for (int i = 2; i * i <= angka; i++) {
            if (angka % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int nAwal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int nAkhir = sc.nextInt();

        System.out.println("Bilangan prima dari " + nAwal + " sampai " + nAkhir + ":");
        for (int i = nAwal; i <= nAkhir; i++) {
            if (isPrima(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}
