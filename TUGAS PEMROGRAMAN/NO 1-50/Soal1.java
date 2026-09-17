import java.util.Scanner;

public class Soal1 {
    // Membalik urutan kalimat (Hallo -> ollaH)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();

        String hasil = "";
        for (int i = kalimat.length() - 1; i >= 0; i--) {
            hasil += kalimat.charAt(i);
        }
        System.out.println("Kalimat terbalik: " + hasil);
    }
}
