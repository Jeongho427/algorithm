
import java.io.*;
import java.util.*;



public class Main {
    int t,n,answer;
    int cnt0,cnt1;
    int[][] dp;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        t = Integer.parseInt(br.readLine());

        dp = new int[41][2];

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i=2;i<=40;i++){
            for(int j=0;j<2;j++){
                dp[i][j] = dp[i-2][j] + dp[i-1][j];
            }
        }

        for(int i=0;i<t;i++){
            answer = 0;
            cnt0 = 0;
            cnt1 = 0;
            int n = Integer.parseInt(br.readLine());

            cnt0 = dp[n][0];
            cnt1 = dp[n][1];

            System.out.println(cnt0+" "+cnt1);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
