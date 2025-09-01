
import java.io.*;
import java.util.*;

public class Main {
    int n;
    int[] parents;
    boolean[] visit;
    ArrayList<Integer>[] map;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void bfs(int v){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v] = true;

        while(!q.isEmpty()){
            int parent = q.poll();

            for(int m:map[parent]){
                if(!visit[m]){
                    visit[m] = true;
                    parents[m] = parent;
                    q.offer(m);
                }
            }
        }
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        parents = new int[n+1];
        visit = new boolean[n+1];
        map = new ArrayList[n+1];

        for(int i=1;i<=n;i++){
            map[i] = new ArrayList<>();
        }

        for(int i=0;i<n-1;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a].add(b);
            map[b].add(a);
        }

        bfs(1);

        for(int i=2;i<=n;i++){
            System.out.println(parents[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
