public class Soal8 {
    // Target: 112333123455555123456
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
        blok(sb, 1);
        blok(sb, 3);
        blok(sb, 5);
        asc(sb, 1, 6);
        System.out.println(sb);
    }
}
