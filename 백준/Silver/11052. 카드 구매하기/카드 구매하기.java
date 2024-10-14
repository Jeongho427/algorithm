
import java.io.*;
import java.util.*;


public class Main {
    int n,answer;
    int[] p;
    int[] dp;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        n=Integer.parseInt(br.readLine());
        p=new int[n+1];
        dp=new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            p[i] = Integer.parseInt(st.nextToken());
            dp[i]=p[i];
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]=Math.max(dp[i],dp[i-j]+p[j]);
            }
        }
        answer=dp[n];

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}