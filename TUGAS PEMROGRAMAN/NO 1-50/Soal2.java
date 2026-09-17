import java.util.Scanner;

public class Soal2 {
    // Mencari & menghitung jumlah kemunculan sebuah huruf dalam kalimat
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        System.out.print("Masukkan huruf yang dicari: ");
        char huruf = sc.nextLine().charAt(0);

        int jumlah = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            if (kalimat.charAt(i) == huruf) {
                jumlah++;
            }
        }
        System.out.println("Huruf '" + huruf + "' muncul sebanyak " + jumlah + " kali");
    }
}
