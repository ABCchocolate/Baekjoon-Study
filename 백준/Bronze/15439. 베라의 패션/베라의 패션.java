import java.io.*;

public class Main {

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Bera bera = new Bera(N);
        int answer = bera.getAnswer(); // 올바른 메서드 호출 방식

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}

     class Bera {
    int answer;

    public Bera(int a) {
        answer = a * (a - 1);
    }

    public int getAnswer() {
        return answer;
    }
}

