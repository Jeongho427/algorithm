
import java.io.*;
import java.util.*;


public class Main {

    int n,m,answer=0;
    boolean[][] map;
    boolean[] visit;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void DFS(int v){
        visit[v]=true;

        for(int i=1;i<=n;i++){
            if(map[v][i]&&!visit[i]){
                DFS(i);
            }
        }
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new boolean[n+1][n+1];
        visit = new boolean[n+1];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u][v]=true;
            map[v][u]=true;
        }

        for(int i=1;i<=n;i++){
            if(!visit[i]){
                DFS(i);
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}