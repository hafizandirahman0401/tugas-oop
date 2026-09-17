public class Bintang16 {
    // Target sama seperti formasi 15 (pola berulang pada soal)
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            System.out.println("0".repeat(n + 1 - i) + "*".repeat(i));
        }
    }
}
