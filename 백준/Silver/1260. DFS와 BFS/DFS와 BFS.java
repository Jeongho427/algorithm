
import java.util.*;
import java.io.*;


public class Main {

    int n,m,v;
    boolean[] visit;
    boolean[][] map;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void DFS(int v){
        System.out.print(v + " ");
        visit[v]=true;
        for(int i=1;i<=n;i++){
            if(map[v][i]&&!visit[i]){
                DFS(i);
            }
        }
    }

    void BFS(int v){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v] = true;
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                int num = q.poll();
                System.out.print(num + " ");

                for(int j=1;j<=n;j++){
                    if(map[num][j]&&!visit[j]){
                        q.offer(j);
                        visit[j] = true;
                    }
                }
            }
        }
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        map = new boolean[n+1][n+1];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = true;
            map[b][a] = true;
        }

        visit = new boolean[n+1];
        DFS(v);
        System.out.println();
        visit = new boolean[n+1];
        BFS(v);
    }

    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}