
import java.util.*;
import java.io.*;


public class Main {

    int n,m,answer;
    boolean[] visit;
    boolean[][] computers;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void DFS(int v){
        visit[v]=true;

        for(int i=1;i<=n;i++){
            if(!visit[i]&&computers[v][i]){
                DFS(i);
                answer++;
            }
        }
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        visit = new boolean[n+1];
        computers = new boolean[n+1][n+1];
        m = Integer.parseInt(br.readLine());

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            computers[a][b] = true;
            computers[b][a] = true;
        }

        DFS(1);

        System.out.println(answer);
    }



    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}