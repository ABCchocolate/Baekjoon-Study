import java.util.Scanner;

public class Main {
    static int N, M;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 1 ~ N 까지 숫자
        M = sc.nextInt(); // 고를 숫자의 개수

        visited = new boolean[N + 1]; // 방문 여부
        result = new int[M]; // 현재 수열 저장

        dfs(0);
    }

    static void dfs(int depth) {
        if (depth == M) {
            // M개를 모두 선택한 경우 출력
            for (int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = i;
                dfs(depth + 1);  // 다음 수 고르기
                visited[i] = false; // 백트래킹
            }
        }
    }
}
