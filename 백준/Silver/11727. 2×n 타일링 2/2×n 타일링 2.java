
import java.io.*;
import java.util.*;


public class Main {
    int n,answer;
    int[] dp=new int[1001];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    void solution() throws Exception{
        n=Integer.parseInt(br.readLine());

        dp[1]=1;
        for(int i=2;i<=n;i++){
            if(i%2==0){
                dp[i]=(dp[i-1]*2+1)%10007;
            }
            else{
                dp[i]=(dp[i-1]*2-1)%10007;
            }
        }
        answer=dp[n];


        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}