
import java.io.*;
import java.util.*;



public class Main {
    int n,m;
    int[] answer;
    boolean[] ch;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    void dfs(int L,int s){
        if(L==m){
            for(int a:answer){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=s;i<=n;i++){
            if(!ch[i]){
                ch[i] = true;
                answer[L] = i;
                dfs(L+1,i+1);
                ch[i] = false;
            }
        }
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ch = new boolean[n+1];
        answer = new int[m];

        dfs(0,1);

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
