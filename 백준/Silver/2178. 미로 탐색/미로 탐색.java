
import java.util.*;
import java.io.*;

class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class Main {

    int n,m,answer=0;
    int[] dx = {-1,1,0,0};
    int[] dy = {0,0,-1,1};
    int[][] map;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;


    void BFS(int x,int y){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y));
        answer++;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Point p = q.poll();
                for(int j=0;j<4;j++){
                    int a = p.x + dx[j];
                    int b = p.y + dy[j];
                    if(a>0&&b>0&&a<=n&&b<=m){
                        if(a==n&&b==m){
                            answer++;
                            return;
                        }
                        if(map[a][b]==1){
                            q.offer(new Point(a,b));
                            map[a][b] = 0;
                        }
                    }
                }
            }
            answer++;
        }
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            String s = br.readLine();
            for(int j=1;j<=m;j++){
                map[i][j] = s.charAt(j-1)-'0';
            }
        }

        BFS(1,1);

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}