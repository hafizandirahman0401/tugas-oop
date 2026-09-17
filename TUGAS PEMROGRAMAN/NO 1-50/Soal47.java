import java.util.Scanner;

public class Soal47 {
    // Total bilangan GENAP dari n_awal s.d n_akhir
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int nAwal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int nAkhir = sc.nextInt();

        long total = 0;
        for (int i = nAwal; i <= nAkhir; i++) {
            if (i % 2 == 0) total += i;
        }
        System.out.println("Total bilangan genap dari " + nAwal + " sampai " + nAkhir + " = " + total);
    }
}
