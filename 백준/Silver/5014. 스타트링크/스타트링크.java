
import java.io.*;
import java.util.*;

class Pair{
    int s,cnt;
    Pair(int s,int cnt){
        this.s=s;
        this.cnt=cnt;
    }
}

public class Main {

    int f,s,g,u,d,answer;
    boolean check;
    boolean[] visit=new boolean[1000001];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void BFS(int s){
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(s,0));

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Pair cur=q.poll();

                if(cur.s==g){
                    answer=cur.cnt;
                    check=true;
                    return;
                }

                int up=cur.s+u;
                int down=cur.s-d;
                if(up<=f&&!visit[up]){
                    q.offer(new Pair(up,cur.cnt+1));
                    visit[up]=true;
                }
                if(down>0&&!visit[down]){
                    q.offer(new Pair(down,cur.cnt+1));
                    visit[down]=true;
                }
            }
        }
    }


    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        f = Integer.parseInt(st.nextToken()); //건물 최고 층
        s = Integer.parseInt(st.nextToken()); //강호 현재 위치
        g = Integer.parseInt(st.nextToken()); //도착지점
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        BFS(s);

        if(check)
            System.out.println(answer);
        else
            System.out.println("use the stairs");
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}