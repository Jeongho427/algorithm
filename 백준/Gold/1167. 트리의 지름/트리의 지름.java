
import java.util.*;
import java.io.*;

class Pair{
    int v, sum;
    Pair(int v,int sum){
        this.v=v;
        this.sum=sum;
    }
}
public class Main {

    int n,answer=0;
    boolean[] visit;
    int[] dis;
    List<Pair>[] tree;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;


    void BFS(int v){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v] = true;
        dis[v] = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            for(Pair p:tree[node]){
                if(!visit[p.v]){
                    dis[p.v] = dis[node] + p.sum;
                    q.offer(p.v);
                    visit[p.v] = true;
                }
            }
        }
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            tree[i] = new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            while(true){
                int next = Integer.parseInt(st.nextToken());
                if(next == -1) break;
                int e = Integer.parseInt(st.nextToken());
                tree[v].add(new Pair(next,e));
            }
        }

        visit = new boolean[n+1];
        dis = new int[n+1];
        BFS(1);

        int max = 0;
        int next = 0;
        for(int i=1;i<=n;i++){
            if(dis[i]>max){
                max = dis[i];
                next = i;
            }
        }

        visit = new boolean[n+1];
        dis = new int[n+1];
        BFS(next);

        Arrays.sort(dis);
        answer = dis[n];

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}