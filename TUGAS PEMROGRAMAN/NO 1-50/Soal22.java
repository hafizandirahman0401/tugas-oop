import java.util.Scanner;

public class Soal22 {
    // Faktorial: 3! = 3 x 2 x 1 = 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = sc.nextInt();

        long hasil = 1;
        StringBuilder proses = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            hasil *= i;
            proses.append(i);
            if (i > 1) proses.append(" x ");
        }
        System.out.println(n + "! = " + proses + " = " + hasil);
    }
}
