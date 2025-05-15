import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt(); // 진짜 약수 개수
        int[] divisors = new int[count];

        for (int i = 0; i < count; i++) {
            divisors[i] = scanner.nextInt();
        }

        // 최소값과 최대값 찾기
        int min = Arrays.stream(divisors).min().getAsInt();
        int max = Arrays.stream(divisors).max().getAsInt();

        // N은 최소 * 최대
        int N = min * max;

        System.out.println(N);
    }
}
