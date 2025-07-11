import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int Youngsik(int min){
        return (min / 30 + 1) * 10;
    }

    public static int Minsik(int min){
        return (min / 60 + 1) * 15;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int callCount = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int youngsikTotal = 0;
        int minsikTotal = 0;

        for(int i = 0; i < callCount; i++){
            int duration = Integer.parseInt(st.nextToken());
            youngsikTotal += Youngsik(duration);
            minsikTotal += Minsik(duration);
        }

        if (youngsikTotal < minsikTotal){
            System.out.println("Y " + youngsikTotal);
        }
        else if (youngsikTotal > minsikTotal){
            System.out.println("M " + minsikTotal);
        }
        else {
            System.out.println("Y M " + youngsikTotal);
        }
    }
}
