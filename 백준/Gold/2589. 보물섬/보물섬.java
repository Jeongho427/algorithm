
import java.io.*;
import java.util.*;

class Point{
    int x,y;

    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

class Main {
    int n,m,answer;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    char[][] map;
    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};
    boolean[][] visit;
    Queue<Point> q = new LinkedList<>();

    void BFS(int x,int y){
        int cnt=0;
        q.offer(new Point(x,y));
        visit=new boolean[n][m];
        visit[x][y]=true;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Point cur = q.poll();
                for(int j=0;j<4;j++){
                    int a=cur.x+dx[j];
                    int b=cur.y+dy[j];
                    if(a>=0&&a<n&&b>=0&&b<m&&!visit[a][b]){
                        if(map[a][b]=='L'){
                            q.offer(new Point(a, b));
                            visit[a][b]=true;
                        }
                    }
                }
            }
            cnt++;
        }
        answer=Math.max(answer,cnt-1);
    }
    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map=new char[n][m];
        for(int i=0;i<n;i++){
            String input = br.readLine();
            for(int j=0;j<m;j++){
                map[i][j] = input.charAt(j);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]=='L'){
                    BFS(i,j);
                }
            }
        }

        System.out.println(answer);
    }


    public static void main(String[] args) throws Exception{
        new Main().solution();
    }

}