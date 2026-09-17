public class Soal11 {
    // Target: 666666123454444123221
    static void asc(StringBuilder sb, int a, int b) {
        for (int x = a; x <= b; x++) sb.append(x);
    }
    static void rep(StringBuilder sb, int angka, int n) {
        for (int x = 0; x < n; x++) sb.append(angka);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        rep(sb, 6, 6);
        asc(sb, 1, 5);
        rep(sb, 4, 4);
        asc(sb, 1, 3);
        rep(sb, 2, 2);
        asc(sb, 1, 1);
        System.out.println(sb);
    }
}
