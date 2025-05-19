

import java.io.*;
import java.util.HashSet;

public class Main {
    /*
    1) 입력 받고
    2) HashSet에 넣고
    3) 갯수 출력
     */
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //다음에 올 줄의 갯수
        int num = Integer.parseInt(br.readLine());


        HashSet dancers = new HashSet<>();
        dancers.add("ChongChong");
        for(int i = 0; i < num; i++){
            String[] names = br.readLine().split(" ");
            String a = names[0];
            String b = names[1];

            if (dancers.contains(a) || dancers.contains(b)) {
                dancers.add(a);
                dancers.add(b);
            }
        }

        bw.write(String.valueOf(dancers.size()));
        bw.flush();
        bw.close();
    }
}