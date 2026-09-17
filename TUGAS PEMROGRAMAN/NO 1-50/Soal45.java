import java.util.Scanner;

public class Soal45 {
    // Hitung jumlah bilangan GANJIL dari minimal 10 input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int jumlahGanjil = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            if (angka % 2 != 0) jumlahGanjil++;
        }
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}
