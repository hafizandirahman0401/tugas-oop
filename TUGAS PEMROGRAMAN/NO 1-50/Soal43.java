import java.util.Scanner;

public class Soal43 {
    // Cari bilangan TERKECIL dari minimal 10 input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int terkecil = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            if (angka < terkecil) terkecil = angka;
        }
        System.out.println("Bilangan terkecil: " + terkecil);
    }
}
