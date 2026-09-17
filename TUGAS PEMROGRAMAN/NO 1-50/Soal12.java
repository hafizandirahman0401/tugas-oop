public class Soal12 {
    // Target: 122123123455555666666123456712345678999999999
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
        asc(sb, 1, 3);
        blok(sb, 5);
        rep(sb, 6, 6);
        asc(sb, 1, 7);
        blok(sb, 9);
        System.out.println(sb);
    }
}
