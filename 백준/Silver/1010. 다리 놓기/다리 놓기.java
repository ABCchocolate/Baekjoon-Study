
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[30][30];

    // 조합 함수
    static int combination(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }
        return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            // M개 중에 N개 뽑는 경우의 수 = mCn
            sb.append(combination(M,N)).append('\n');
        }
        System.out.println(sb);
    }
}