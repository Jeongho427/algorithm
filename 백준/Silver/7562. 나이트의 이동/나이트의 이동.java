
import java.util.*;
import java.io.*;

class Point {
    int x,y,cnt;
    Point(int x,int y,int cnt){
        this.x=x;
        this.y=y;
        this.cnt=cnt;
    }
}

public class Main {
    int l;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int BFS(int sx, int sy, int ax, int ay) {
        boolean[][] visit = new boolean[l][l];
        int[] dx={-1,1,-1,1,-2,-2,2,2};
        int[] dy={-2,-2,2,2,-1,1,-1,1};

        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(sx, sy,0));
        visit[sx][sy]=true;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Point cur = q.poll();

                if(cur.x==ax&&cur.y==ay)
                    return cur.cnt;

                for(int j=0;j<8;j++){
                    int a=cur.x+dx[j];
                    int b=cur.y+dy[j];
                    if(a>=0&&a<l&&b>=0&&b<l&&!visit[a][b]){
                        q.offer(new Point(a,b,cur.cnt+1));
                        visit[a][b]=true;
                    }
                }
            }
        }
        return 0;
    }

    void solution() throws Exception {
        int T,sx,sy,ax,ay,answer;

        T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            l = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());
            sx = Integer.parseInt(st.nextToken());
            sy = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            ax = Integer.parseInt(st.nextToken());
            ay = Integer.parseInt(st.nextToken());

            answer=BFS(sx, sy, ax, ay);

            System.out.println(answer);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}

