
import java.io.*;
import java.util.*;

public class Main {
    int n,m,max,cnt;
    int[] answer;
    List<Integer>[] trust;
    boolean[] visit;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void dfs(int v, boolean[] visit){
        visit[v] = true;
        if(trust[v].isEmpty()){
            return;
        }
        for(int t:trust[v]){
            if(!visit[t]){
                cnt++;
                dfs(t,visit);
            }
        }
    }

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        answer = new int[n+1];
        trust = new ArrayList[n+1];
        for(int i=1;i<n+1;i++){
            trust[i] = new ArrayList<>();
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            trust[b].add(a);
        }

        for(int i=1;i<=n;i++){
            cnt = 0;
            visit = new boolean[n+1];
            dfs(i,visit);
            answer[i] = cnt;
            max = Math.max(max,cnt);
        }

        for(int i=1;i<=n;i++){
            if(answer[i]==max){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
