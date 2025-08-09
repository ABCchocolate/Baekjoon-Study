import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];

        dfs(1, 0); // 시작 숫자, 현재 깊이
    }

    static void dfs(int start, int depth) {
        // 수열 길이가 M이면 출력
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        // start부터 N까지 반복 (오름차순)
        for (int i = start; i <= N; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1); // 다음 수는 i+1부터 시작
        }
    }
}
