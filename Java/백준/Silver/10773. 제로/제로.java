
import java.io.*;
import java.util.Stack;



public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++){
            int Input = Integer.parseInt(br.readLine());
            if(Input != 0){
                stack.add(Input);
            }
            else{
                stack.pop();
            }
        }
        for(int s : stack){
            ans += s;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();

    }
}
