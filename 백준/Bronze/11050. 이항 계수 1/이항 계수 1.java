
import java.io.*;
import java.util.StringTokenizer;

class Factorial{

    public int Factorial(int x){
        int answer = 1;
        for(int i = x; i > 0; i--){
            answer = answer * i;
        }
        return answer;
    }


}



public class Main {
    public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Factorial f = new Factorial();

            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int k = (x-y);
            int answer = 0;

            answer =   f.Factorial(x)/ (f.Factorial(k) * f.Factorial(y));

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(String.valueOf(answer));
            bw.flush();
            bw.close();
    }
}
