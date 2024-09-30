
import java.io.*;
import java.util.*;

class Point{
    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

public class Main {
    int r,c;
    char[][] map;
    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};
    boolean flag;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    Queue<Point> q = new LinkedList<>();
    void BFS(){
        while(!q.isEmpty()){
            Point p=q.poll();
            for(int i=0;i<4;i++){
                int a=p.x+dx[i];
                int b=p.y+dy[i];
                if(a>=0&&a<r&&b>=0&&b<c){
                    if(map[a][b]=='.'){
                        map[a][b]='D';
                    }
                    if(map[a][b]=='S'){
                        System.out.println(0);
                        System.exit(0);
                    }
                }
            }
        }
    }
    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map=new char[r][c];
        for(int i=0;i<r;i++){
            String str = br.readLine();
            for(int j=0;j<c;j++){
                map[i][j]=str.charAt(j);
                if(map[i][j]=='W'){
                    q.offer(new Point(i,j));
                }
            }
        }
        BFS();
        System.out.println(1);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}