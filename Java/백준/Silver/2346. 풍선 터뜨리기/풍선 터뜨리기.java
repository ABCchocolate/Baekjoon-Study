import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // deque에는 [풍선번호, 이동값]을 int[]로 저장
        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            int move = Integer.parseInt(st.nextToken());
            deque.offer(new int[]{i, move});
        }

        while (!deque.isEmpty()) {
            int[] current = deque.poll(); // 현재 풍선 터뜨림
            sb.append(current[0]).append(" ");

            if (deque.isEmpty()) break;

            int steps = current[1];

            if (steps > 0) {
                // 오른쪽으로 steps - 1번 이동
                for (int i = 0; i < steps - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                // 왼쪽으로 -steps번 이동
                for (int i = 0; i < -steps; i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}
