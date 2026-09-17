import java.util.Scanner;

public class Soal29 {
    // Menampilkan bilangan yang habis dibagi 3 dari n_awal s.d n_akhir
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int nAwal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int nAkhir = sc.nextInt();

        System.out.println("Bilangan habis dibagi 3 dari " + nAwal + " sampai " + nAkhir + ":");
        for (int i = nAwal; i <= nAkhir; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
