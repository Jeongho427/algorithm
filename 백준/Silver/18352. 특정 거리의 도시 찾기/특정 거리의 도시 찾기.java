
import java.io.*;
import java.util.*;

class Node{
    int num,cnt;

    Node(int num,int cnt){
        this.num = num;
        this.cnt = cnt;
    }
}

public class Main {
    int n,m,k,x;
    boolean[] visit;
    ArrayList<Integer>[] map;
    List<Integer> answer = new ArrayList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void bfs(int start){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,0));
        visit[start] = true;

        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.cnt==k){
                answer.add(node.num);
            }
            for(int n:map[node.num]){
                if(!visit[n]){
                    q.offer(new Node(n,node.cnt+1));
                    visit[n] = true;
                }
            }
        }
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        map = new ArrayList[n+1];
        visit = new boolean[n+1];

        for(int i=0;i<=n;i++){
            map[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            map[s].add(e);
        }

        bfs(x);

        Collections.sort(answer);

        if(answer.isEmpty()){
            System.out.println(-1);
            return;
        }
        for(int a:answer){
            System.out.println(a);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
