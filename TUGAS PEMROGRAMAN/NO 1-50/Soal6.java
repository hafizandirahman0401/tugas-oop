public class Soal6 {
    // Target: 112123123412345123456
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(j);
            }
        }
        System.out.println(sb);
    }
}
