public class Soal4 {
    // Target: 122333444455555666666
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}
