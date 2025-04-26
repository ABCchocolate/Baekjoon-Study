import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 학생 수
        Queue<Integer> waiting = new LinkedList<>();
        Stack<Integer> plusing = new Stack<>();

        for (int i = 0; i < n; i++) {
            waiting.offer(sc.nextInt());
        }

        int current = 1; // 받을 번호표 1번부터 시작

        while (!waiting.isEmpty() || !plusing.isEmpty()) {
            if (!waiting.isEmpty() && waiting.peek() == current) {
                waiting.poll(); // 대기줄에서 바로 통과
                current++;
            } else if (!plusing.isEmpty() && plusing.peek() == current) {
                plusing.pop(); // 옆줄에서 통과
                current++;
            } else if (!waiting.isEmpty()) {
                plusing.push(waiting.poll()); // 대기줄에서 옆줄로 이동
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}
