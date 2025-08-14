
import java.io.*;
import java.util.*;


public class Main {
    int n,answer = Integer.MAX_VALUE;
    int[][] w;
    boolean[] ch;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void dfs(int L,int cur,int sum){
        if(L==n-1){
            if(w[cur][0]!=0){
                sum += w[cur][0];
                answer = Math.min(answer,sum);
            }
            return;
        }
        for(int i=0;i<n;i++){
            if(!ch[i]&&w[cur][i]!=0){
                ch[i] = true;
                dfs(L+1,i,sum+w[cur][i]);
                ch[i] = false;
            }
        }
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        w = new int[n][n];
        ch = new boolean[n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());

            for(int j=0;j<n;j++){
                w[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ch[0] = true;
        dfs(0,0,0);

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
