
import java.util.*;
import java.io.*;

public class Main {

    int t,n;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            n = Integer.parseInt(br.readLine());
            int[][] s=new int[2][n];
            int[][] dp=new int[2][n];

            for(int j=0;j<2;j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0;k<n;k++){
                    s[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][0]=s[0][0];
            dp[1][0]=s[1][0];
            if(n>1){
                dp[0][1]=s[1][0]+s[0][1];
                dp[1][1]=s[0][0]+s[1][1];
            }

            for(int j=2;j<n;j++){
                dp[0][j]=Math.max(dp[1][j-1],dp[1][j-2])+s[0][j];
                dp[1][j]=Math.max(dp[0][j-1],dp[0][j-2])+s[1][j];
            }
            
            int answer=0;
            for(int j=0;j<2;j++){
                for(int k=0;k<n;k++){
                    answer=Math.max(answer,dp[j][k]);
                }
            }

            System.out.println(answer);
       }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}