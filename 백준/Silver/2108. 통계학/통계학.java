import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        // -4000 ~ 4000 범위라 크기를 8001로 설정, 인덱스 0은 -4000, 인덱스 8000은 4000
        int[] frequency = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            numbers[i] = num;
            sum += num;
            frequency[num + 4000]++;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        Arrays.sort(numbers);

        // 1. 산술평균 (반올림)
        int mean = (int) Math.round((double) sum / N);

        // 2. 중앙값
        int median = numbers[N / 2];

        // 3. 최빈값 - 가장 많이 등장하는 값 중 두 번째로 작은 값 출력
        int maxFreq = 0;
        for (int f : frequency) {
            if (f > maxFreq) maxFreq = f;
        }

        List<Integer> modes = new ArrayList<>();
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFreq) {
                modes.add(i - 4000);
            }
        }

        int mode;
        if (modes.size() == 1) {
            mode = modes.get(0);
        } else {
            // 두 번째로 작은 값
            mode = modes.get(1);
        }

        // 4. 범위
        int range = max - min;

        // 출력
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}
