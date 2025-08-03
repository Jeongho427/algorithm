
import java.io.*;
import java.util.*;

public class Main {
    int n,answer;
    int[] dp = new int[5001];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        dp[0] = Integer.MAX_VALUE;
        dp[1] = Integer.MAX_VALUE;
        dp[2] = Integer.MAX_VALUE;
        dp[3] = 1;
        dp[4] = Integer.MAX_VALUE;
        dp[5] = 1;

        for(int i=6;i<=n;i++){
            if(dp[i-3]==Integer.MAX_VALUE&&dp[i-5]==Integer.MAX_VALUE){
                dp[i] = Integer.MAX_VALUE;
            }
            else{
                dp[i] = Math.min(dp[i-3],dp[i-5])+1;
            }
        }

        if(dp[n]==Integer.MAX_VALUE){
            answer = -1;
        }
        else{
            answer = dp[n];
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
