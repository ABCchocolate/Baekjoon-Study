import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 개수
        sc.nextLine(); // 개행 문자 제거

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            if (isVPS(str)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // 올바른 괄호 문자열인지 판별하는 메서드
    public static boolean isVPS(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }

            // ')'가 '('보다 많아지는 순간 VPS가 아님
            if (count < 0) {
                return false;
            }
        }

        // 괄호가 모두 짝지어졌는지 확인
        return count == 0;
    }
}
