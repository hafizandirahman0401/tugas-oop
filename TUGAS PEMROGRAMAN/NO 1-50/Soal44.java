import java.util.Scanner;

public class Soal44 {
    // Hitung jumlah bilangan GENAP dari minimal 10 input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int jumlahGenap = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            if (angka % 2 == 0) jumlahGenap++;
        }
        System.out.println("Jumlah bilangan genap: " + jumlahGenap);
    }
}
