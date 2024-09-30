
import java.io.*;
import java.util.*;

class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Main {
    int n,m,answer;
    int[][] tomatoes;
    boolean[][] visit;
    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    Queue<Point> q = new LinkedList<>();

    boolean checkTomatoes(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(tomatoes[i][j]==0)
                    return false;
            }
        }
        return true;
    }

    void BFS(){
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Point cur = q.poll();
                for(int j=0;j<4;j++){
                    int a=cur.x+dx[j];
                    int b=cur.y+dy[j];
                    if(a>=0&&a<n&&b>=0&&b<m){
                        if(tomatoes[a][b]==0){
                            q.offer(new Point(a,b));
                            tomatoes[a][b]=1;
                        }
                    }
                }
            }
            answer++;
        }
    }

    void solution() throws Exception {
        st=new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        tomatoes=new int[n][m];
        visit=new boolean[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                tomatoes[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(tomatoes[i][j]==1){
                    q.offer(new Point(i,j));
                }
            }
        }

        BFS();

        if(!checkTomatoes())
            System.out.println(-1);
        else
            System.out.println(answer-1);
    }



    public static void main(String[] args) throws Exception{
        new Main().solution();
    }

}