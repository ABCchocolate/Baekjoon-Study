import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        // 1부터 N까지 큐에 추가
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 카드가 한 장 남을 때까지 반복
        while (queue.size() > 1) {
            queue.poll();              // 제일 위의 카드 버림
            queue.add(queue.poll());   // 다음 카드를 맨 아래로 이동
        }

        // 마지막으로 남은 카드 출력
        System.out.println(queue.peek());
    }
}
