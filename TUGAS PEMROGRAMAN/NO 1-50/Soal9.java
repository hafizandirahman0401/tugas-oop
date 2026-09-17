public class Soal9 {
    // Target: 122123444412345666666
    static void asc(StringBuilder sb, int a, int b) {
        for (int x = a; x <= b; x++) sb.append(x);
    }
    static void rep(StringBuilder sb, int angka, int n) {
        for (int x = 0; x < n; x++) sb.append(angka);
    }
    static void blok(StringBuilder sb, int i) {
        asc(sb, 1, i - 1);
        rep(sb, i, i);
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        blok(sb, 2);
        blok(sb, 4);
        blok(sb, 6);
        System.out.println(sb);
    }
}
