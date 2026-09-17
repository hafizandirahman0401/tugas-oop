public class Soal14 {
    // Target: 888888887777777654321543214444333211
    static void desc(StringBuilder sb, int a, int b) {
        for (int x = a; x >= b; x--) sb.append(x);
    }
    static void rep(StringBuilder sb, int angka, int n) {
        for (int x = 0; x < n; x++) sb.append(angka);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        rep(sb, 8, 8);
        rep(sb, 7, 7);
        desc(sb, 6, 1);
        desc(sb, 5, 1);
        rep(sb, 4, 4);
        rep(sb, 3, 3);
        desc(sb, 2, 1);
        rep(sb, 1, 1);
        System.out.println(sb);
    }
}
