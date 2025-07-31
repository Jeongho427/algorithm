
import java.io.*;
import java.util.*;

public class Main {
    int n;
    long answer;
    Integer[] tips;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        tips = new Integer[n];

        for(int i=0;i<n;i++){
            tips[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(tips, Comparator.reverseOrder());

        for(int i=0;i<n;i++){
            if(tips[i]-i<0){
                break;
            }
            answer += tips[i] - i;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
