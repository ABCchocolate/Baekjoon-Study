
import java.io.*;
class Factorial{
    int ans = 1;
    public int Factorial(int x){
        for(int i = x; i >0; i--){
            ans = i * ans;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        Factorial F = new Factorial();
        answer = F.Factorial(N);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
