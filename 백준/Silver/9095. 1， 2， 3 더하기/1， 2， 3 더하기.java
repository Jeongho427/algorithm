
import java.io.*;
import java.util.*;


public class Main {
    int t,n;
    String answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb =new StringBuilder();

    void solution() throws Exception{
        t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            n = Integer.parseInt(br.readLine());
            int[] dp=new int[12];

            dp[1]=1;
            dp[2]=2;
            dp[3]=4;
            for(int j=4;j<=n;j++){
                dp[j]=dp[j-3]+dp[j-2]+dp[j-1];
            }
            sb.append(dp[n]).append("\n");
        }
        answer=sb.toString();

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}