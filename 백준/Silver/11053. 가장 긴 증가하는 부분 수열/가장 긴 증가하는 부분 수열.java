
import java.io.*;
import java.util.*;



class Main {
    int n,max,answer;
    int[] arr=new int[1001];
    int[] dp=new int[1001];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void LIS(){
        for(int i=1;i<=n;i++){
            dp[i]=1;
            for(int j=1;j<i;j++){
                if(arr[j]!=0&&arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            answer=Math.max(answer,dp[i]);
        }
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        LIS();
        System.out.println(answer);
    }



    public static void main(String[] args) throws Exception{
        new Main().solution();
    }

}