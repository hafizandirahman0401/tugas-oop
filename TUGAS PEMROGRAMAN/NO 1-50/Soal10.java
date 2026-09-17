public class Soal10 {
    // Target: 654321555554321333211
    static void desc(StringBuilder sb, int a, int b) {
        for (int x = a; x >= b; x--) sb.append(x);
    }
    static void rep(StringBuilder sb, int angka, int n) {
        for (int x = 0; x < n; x++) sb.append(angka);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        desc(sb, 6, 1);
        rep(sb, 5, 5);
        desc(sb, 4, 1);
        rep(sb, 3, 3);
        desc(sb, 2, 1);
        rep(sb, 1, 1);
        System.out.println(sb);
    }
}
