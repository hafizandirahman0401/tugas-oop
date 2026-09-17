public class Soal15 {
    // Target: 876543217654321666666555554321321221
    static void desc(StringBuilder sb, int a, int b) {
        for (int x = a; x >= b; x--) sb.append(x);
    }
    static void rep(StringBuilder sb, int angka, int n) {
        for (int x = 0; x < n; x++) sb.append(angka);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        desc(sb, 8, 1);
        desc(sb, 7, 1);
        rep(sb, 6, 6);
        rep(sb, 5, 5);
        desc(sb, 4, 1);
        desc(sb, 3, 1);
        rep(sb, 2, 2);
        rep(sb, 1, 1);
        System.out.println(sb);
    }
}
