
import java.util.*;
import java.io.*;

class Point{
    int x,y,cnt;
    Point(int x,int y,int cnt){
        this.x=x;
        this.y=y;
        this.cnt=cnt;
    }
}
public class Main {

    int R,C,answer;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    char[][] map;
    boolean[] check;
    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};

    void DFS(int x, int y,int cnt){
        answer=Math.max(answer,cnt);
        for(int i=0;i<4;i++){
            int a=x+dx[i];
            int b=y+dy[i];
            if(a>=0&&a<R&&b>=0&&b<C){
                if(!check[map[a][b]-'A']){
                    check[map[a][b]-'A']=true;
                    DFS(a,b,cnt+1);
                    check[map[a][b]-'A']=false;
                }
            }
        }
    }

    void solution()throws Exception{
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map=new char[R][C];
        for(int i=0;i<R;i++){
            String str = br.readLine();
            for(int j=0;j<C;j++){
                map[i][j]=str.charAt(j);
            }
        }
        check=new boolean[27];
        check[map[0][0]-'A']=true;
        DFS(0,0,1);
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
