import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int length = (int) Math.pow(3, n);
            char[] arr = new char[length];

            for (int i = 0; i < length; i++) {
                arr[i] = '-';
            }

            cantor(arr, 0, length);
            System.out.println(new String(arr));
        }

        sc.close();
    }

    // start는 포함, end는 제외
    private static void cantor(char[] arr, int start, int end) {
        int length = end - start;

        if (length < 3) {
            return;
        }

        int third = length / 3;

        // 가운데 구간 공백 처리
        for (int i = start + third; i < start + 2 * third; i++) {
            arr[i] = ' ';
        }

        // 양쪽 구간 재귀 호출
        cantor(arr, start, start + third);
        cantor(arr, start + 2 * third, end);
    }
}
