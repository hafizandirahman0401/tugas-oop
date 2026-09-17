public class Soal17 {
    // Target: 2 12 7 17 12 22 17 27 22 32  => n+10, n-5, ...
    public static void main(String[] args) {
        int n = 2;
        int jumlahSuku = 10;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for (int i = 1; i < jumlahSuku; i++) {
            if (i % 2 == 1) n = n + 10;
            else n = n - 5;
            sb.append(" ").append(n);
        }
        System.out.println(sb);
    }
}
