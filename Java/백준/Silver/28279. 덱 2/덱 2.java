import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력과 출력을 빠르게 처리하기 위한 클래스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 명령 수 입력
        int N = Integer.parseInt(br.readLine());

        // 덱 자료구조 선언
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            int cmd = Integer.parseInt(parts[0]);

            switch (cmd) {
                case 1: // 앞에 추가
                    deque.addFirst(Integer.parseInt(parts[1]));
                    break;
                case 2: // 뒤에 추가
                    deque.addLast(Integer.parseInt(parts[1]));
                    break;
                case 3: // 앞에서 제거
                    sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append("\n");
                    break;
                case 4: // 뒤에서 제거
                    sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append("\n");
                    break;
                case 5: // 사이즈 출력
                    sb.append(deque.size()).append("\n");
                    break;
                case 6: // 비어있는지
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case 7: // 앞 원소 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append("\n");
                    break;
                case 8: // 뒤 원소 출력
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append("\n");
                    break;
            }
        }

        // 출력
        System.out.print(sb);
    }
}
