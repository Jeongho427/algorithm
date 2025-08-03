
import java.io.*;
import java.util.*;

public class Main {
    int t,n,m;
    int[][] dp = new int[30][30];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        t = Integer.parseInt(br.readLine());
        dp[0][0] = 1;

        for(int i=1;i<30;i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }

        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            System.out.println(dp[m][n]);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
