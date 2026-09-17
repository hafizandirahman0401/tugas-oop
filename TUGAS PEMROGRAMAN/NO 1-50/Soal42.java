import java.util.Scanner;

public class Soal42 {
    // Cari bilangan TERBESAR dari minimal 10 input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int terbesar = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            if (angka > terbesar) terbesar = angka;
        }
        System.out.println("Bilangan terbesar: " + terbesar);
    }
}
