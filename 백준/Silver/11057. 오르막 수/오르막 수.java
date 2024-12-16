
import java.util.*;
import java.io.*;

public class Main {

    int n;
    long answer;
    long[][] dp;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        dp=new long[n+1][10];

        for(int i=0;i<=9;i++){
            dp[1][i]=1;
        }

        for(int i=2;i<=n;i++){
            dp[i][0]=1;
            for(int j=1;j<=9;j++){
                for(int k=0;k<=j;k++){
                    dp[i][j]+=dp[i-1][k]%10007;
                }
            }
        }

        for(int i=0;i<=9;i++){
            answer+=dp[n][i]%10007;
        }

        System.out.println(answer%10007);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}