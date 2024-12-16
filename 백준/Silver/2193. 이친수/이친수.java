
import java.util.*;
import java.io.*;

public class Main {

    int n;
    long answer;
    long[][] dp;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        dp=new long[n+1][2];
        dp[1][0]=0;
        dp[1][1]=1;
        if(n>=2){
            dp[2][0]=1;
            dp[2][1]=0;
        }

        for(int i=3;i<=n;i++){
            for(int j=0;j<=1;j++){
                if(j==0){
                    dp[i][j]=dp[i-1][0]+dp[i-1][1];
                }
                else{
                    dp[i][j]=dp[i-1][0];
                }
            }
        }
        answer=dp[n][0]+dp[n][1];

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}