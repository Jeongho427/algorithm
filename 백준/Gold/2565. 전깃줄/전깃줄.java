
import java.io.*;
import java.util.*;



class Main {
    int n,max,answer;
    int[] arr=new int[501];
    int[] dp=new int[501];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void LIS(){
        for(int i=1;i<=max;i++){
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
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a]=b;
            max=Math.max(max,a);
        }
        LIS();
        System.out.println(n-answer);
    }



    public static void main(String[] args) throws Exception{
        new Main().solution();
    }

}