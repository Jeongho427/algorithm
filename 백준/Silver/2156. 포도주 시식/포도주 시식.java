
import java.util.*;
import java.io.*;

public class Main {

    int n,answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        int[] p=new int[n+1];
        int[] dp=new int[n+1];

        for(int i=1;i<=n;i++){
            p[i] = Integer.parseInt(br.readLine());
        }

        dp[1]=p[1];
        if(n>1){
            dp[2]=dp[1]+p[2];
        }

        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-1],Math.max(dp[i-3]+p[i-1]+p[i],dp[i-2]+p[i]));
        }
        answer=dp[n];

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}