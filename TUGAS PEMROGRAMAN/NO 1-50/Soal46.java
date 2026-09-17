import java.util.Scanner;

public class Soal46 {
    // Total bilangan bulat POSITIF dari n_awal s.d n_akhir
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int nAwal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int nAkhir = sc.nextInt();

        long total = 0;
        for (int i = nAwal; i <= nAkhir; i++) {
            if (i > 0) total += i;
        }
        System.out.println("Total bilangan positif dari " + nAwal + " sampai " + nAkhir + " = " + total);
    }
}
