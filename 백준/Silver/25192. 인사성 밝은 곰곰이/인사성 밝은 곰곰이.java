import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashSet TotalMember = new HashSet();

        int answer = 0; //이모티콘 사용 횟수

        for(int i =0; i < N; i++){
            String emotion = br.readLine();

            if(emotion.equals("ENTER")){
                answer += TotalMember.size();

                TotalMember = new HashSet();
            }
            else {
                TotalMember.add(emotion);
            }
        }

        answer += TotalMember.size();
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();





    }
}
