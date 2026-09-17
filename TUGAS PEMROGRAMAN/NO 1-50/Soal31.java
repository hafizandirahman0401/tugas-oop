import java.util.Scanner;

public class Soal31 {
    // Menampilkan bilangan yang habis dibagi 5 dari n_awal s.d n_akhir
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int nAwal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int nAkhir = sc.nextInt();

        System.out.println("Bilangan habis dibagi 5 dari " + nAwal + " sampai " + nAkhir + ":");
        for (int i = nAwal; i <= nAkhir; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
