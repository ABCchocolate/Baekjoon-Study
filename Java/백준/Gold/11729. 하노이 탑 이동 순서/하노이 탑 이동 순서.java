

import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void hanoi(int n, int from, int temp, int to) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            count++;
            return;
        }

        // 1단계: n-1개를 from → temp로 이동
        hanoi(n - 1, from, to, temp);

        // 2단계: 가장 큰 원판 1개를 from → to로 이동
        sb.append(from).append(" ").append(to).append("\n");
        count++;

        // 3단계: n-1개를 temp → to로 이동
        hanoi(n - 1, temp, from, to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        hanoi(n, 1, 2, 3);
        System.out.println(count);
        System.out.print(sb);
    }
}
