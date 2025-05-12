   
    import java.io.*;
    import java.util.*;

    class Top {
        public int route(int x) {
            return (int) Math.pow(2, x);
        }
    }


    public class Main {
      public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //박스 블럭의 수
          int x = Integer.parseInt(br.readLine());

          int answer = 0;
          Top t = new Top();
          answer = t.route(x);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(answer));
        bw.flush(); //버퍼 안에  answer 담기
        bw.close();

      }
    }