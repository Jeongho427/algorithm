import java.io.*;
import java.util.*;


public class Main {
    int n,answer;
    int[] dp;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        dp=new int[n+1];
      
        dp[1]=0;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+1;
            if(i%3==0&&i%2!=0){
                int num=dp[i/3]+1;
                dp[i]=Math.min(dp[i],num);
            }
            if(i%2==0&&i%3!=0){
                int num=dp[i/2]+1;
                dp[i]=Math.min(dp[i],num);
            }
            if(i%3==0&&i%2==0){
                int num=Math.min(dp[i/3],dp[i/2])+1;
                dp[i]=Math.min(dp[i],num);
            }
        }
        answer=dp[n];

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}