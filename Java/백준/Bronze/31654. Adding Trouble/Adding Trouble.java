

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));


        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int answer = sum(A,B);
        if(answer == C){
            bw.write("correct!");
        }
        else {
            bw.write("wrong!");
        }
        bw.flush();

        if(br != null){
            br.close();
        }
        if(bw != null){
            bw.close();
        }

    }
}
