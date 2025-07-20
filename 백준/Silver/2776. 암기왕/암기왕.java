import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 빠르게 받기 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 테스트케이스 수 입력
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            // 수첩 1 정보
            int N = Integer.parseInt(br.readLine());
            HashSet<Integer> notebook1 = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                notebook1.add(Integer.parseInt(st.nextToken()));
            }

            // 수첩 2 정보
            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (notebook1.contains(num)) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }

        // 결과 출력
        System.out.print(sb.toString());
    }
}
