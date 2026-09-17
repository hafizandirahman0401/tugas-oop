import java.util.Scanner;

public class Soal23 {
    // Deret Fibonacci: 0,1,1,2,3,5,8,13,21,34,... sampai nilai maksimum yang ditentukan
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai maksimum: ");
        int maks = sc.nextInt();

        int a = 0, b = 1;
        StringBuilder sb = new StringBuilder();
        while (a <= maks) {
            sb.append(a).append(" ");
            int berikutnya = a + b;
            a = b;
            b = berikutnya;
        }
        System.out.println("Deret Fibonacci: " + sb.toString().trim());
    }
}
