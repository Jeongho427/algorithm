import java.io.*;
import java.util.*;


public class Main {
    int n,answer;
    int[] dp;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    void solution() throws Exception{
        n=Integer.parseInt(br.readLine());
        dp=new int[1001];

        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%10007;
        }
        answer=dp[n];

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}