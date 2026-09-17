public class Soal7 {
    // Target: 654321543214321321211
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 6; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                sb.append(j);
            }
        }
        System.out.println(sb);
    }
}
