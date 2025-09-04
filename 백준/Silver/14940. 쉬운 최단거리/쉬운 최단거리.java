
import java.io.*;
import java.util.*;


class Point{
    int x,y,cnt;

    Point(int x,int y,int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

public class Main {
    int n,m;
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};
    int[][] map;
    boolean[][] visit;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void bfs(int x,int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y,0));
        map[x][y] = 0;
        visit[x][y] = true;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                Point p = q.poll();

                for(int j=0;j<4;j++){
                    int a = p.x+dx[j];
                    int b = p.y+dy[j];

                    if(a>=0&&a<n&&b>=0&&b<m&&!visit[a][b]){
                        if(map[a][b]==1){
                            q.offer(new Point(a,b,p.cnt+1));
                            visit[a][b] = true;
                            map[a][b]=p.cnt+1;
                        }
                    }
                }
            }
        }
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visit = new boolean[n][m];

        int x = 0;
        int y = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==2){
                    x=i;
                    y=j;
                }
            }
        }

        bfs(x,y);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visit[i][j]&&map[i][j]==1){
                    System.out.print(-1+" ");
                }
                else{
                    System.out.print(map[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
