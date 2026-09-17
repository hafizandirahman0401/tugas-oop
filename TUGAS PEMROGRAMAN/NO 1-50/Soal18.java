public class Soal18 {
    // Target: 5 2 7 4 9 6 11 8 13 10 15 12  => n-3, n+5, ...
    public static void main(String[] args) {
        int n = 5;
        int jumlahSuku = 12;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for (int i = 1; i < jumlahSuku; i++) {
            if (i % 2 == 1) n = n - 3;
            else n = n + 5;
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }
}
