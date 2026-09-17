import java.util.Scanner;

public class Soal3 {
    // Menghitung jumlah karakter dalam kalimat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        System.out.println("Jumlah karakter: " + kalimat.length());
    }
}
