

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> wordMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> wordList = new ArrayList<>(wordMap.keySet());

        // 정렬: 빈도 내림차순 → 길이 내림차순 → 사전순 오름차순
        wordList.sort((a, b) -> {
            int freqA = wordMap.get(a);
            int freqB = wordMap.get(b);
            if (freqA != freqB) {
                return freqB - freqA;
            }
            if (a.length() != b.length()) {
                return b.length() - a.length();
            }
            return a.compareTo(b);
        });

        for (String word : wordList) {
            bw.write(word);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
