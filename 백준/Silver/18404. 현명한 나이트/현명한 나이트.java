
import java.io.*;
import java.util.*;

class Point{
    int x, y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    int n,m;
    Point knight;
    int[] dx = {-2,-2,-1,-1,1,1,2,2};
    int[] dy = {-1,1,-2,2,-2,2,-1,1};
    Point[] e;
    int[][] dist;
    boolean[][] visit;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void bfs(int x,int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y));
        visit[x][y] = true;

        while(!q.isEmpty()){
            Point cur = q.poll();

            for(int i=0;i<8;i++){
                int a = cur.x + dx[i];
                int b = cur.y + dy[i];

                if(a>0&&a<=n&&b>0&&b<=n&&!visit[a][b]){
                    q.offer(new Point(a,b));
                    dist[a][b] = dist[cur.x][cur.y] + 1;
                    visit[a][b] = true;
                }
            }
        }
    }

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        e = new Point[m];
        dist = new int[n+1][n+1];
        visit = new boolean[n+1][n+1];

        st = new StringTokenizer(br.readLine());
        int kx = Integer.parseInt(st.nextToken());
        int ky = Integer.parseInt(st.nextToken());

        knight = new Point(kx,ky);

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            e[i] = new Point(x,y);
        }

        bfs(knight.x,knight.y);

        for(int i=0;i<m;i++){
            System.out.print(dist[e[i].x][e[i].y] + " ");
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
