
import java.io.*;
import java.util.*;


class Point{
    int x,y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    int n,m,cheese;
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};
    int[][] map;
    boolean[][] visit;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void bfs(){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(0,0));
        visit[0][0] = true;

        while(!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Point p = q.poll();

                for (int j = 0; j < 4; j++) {
                    int a = p.x + dx[j];
                    int b = p.y + dy[j];

                    if (a>=0&&a<n&&b>=0&&b<m&&!visit[a][b]) {
                        if (map[a][b]==0) {
                            q.offer(new Point(a, b));
                        }
                        else{
                            cheese--;
                            map[a][b] = 0;
                        }
                        visit[a][b] = true;
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

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j]==1){
                    cheese++;
                }
            }
        }

        int last = 0;
        int time = 0;
        while(cheese!=0){
            visit = new boolean[n][m];
            last = cheese;
            bfs();
            time++;
        }

        System.out.println(time);
        System.out.println(last);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
