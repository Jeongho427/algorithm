import java.util.*;

class Point{
    int x,y,cnt;
    Point(int x,int y,int cnt){
        this.x=x;
        this.y=y;
        this.cnt=cnt;
    }
}

class Solution {
    int row,col,answer,answer2;
    int sx,sy;
    int lx,ly;
    boolean flag=true;
    
    char[][] map;
    int[] dx={-1,1,0,0};
    int[] dy={0,0,-1,1};
    boolean[][] visit;
    
    
    Queue<Point> q=new LinkedList<>();
    
    void BFS(int x,int y){
        q.offer(new Point(x,y,0));
        
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Point p=q.poll();
                
                for(int j=0;j<4;j++){
                    int a=p.x+dx[j];
                    int b=p.y+dy[j];
                    if(a>=0&&a<row&&b>=0&&b<col&&!visit[a][b]){
                        int c=map[a][b];
                        int ncnt=p.cnt+1;
                        if(c=='O'||c=='E'){
                            q.offer(new Point(a,b,ncnt));
                            visit[a][b]=true;
                        }
                        else if(c=='L'){
                            lx=a;
                            ly=b;
                            answer=ncnt;
                            return;
                        }
                    }
                }
            }
        }
        if(answer==0){
            flag=false;
        }
    }
    
    void BFS2(int x,int y){
        q.offer(new Point(x,y,0));
        
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Point p=q.poll();
                
                for(int j=0;j<4;j++){
                    int a=p.x+dx[j];
                    int b=p.y+dy[j];
                    if(a>=0&&a<row&&b>=0&&b<col&&!visit[a][b]){
                        int c=map[a][b];
                        int ncnt=p.cnt+1;
                        if(c=='O'||c=='S'){
                            q.offer(new Point(a,b,ncnt));
                            visit[a][b]=true;
                        }
                        else if(c=='E'){
                            answer2=ncnt;
                            return;
                        }
                    }
                }
            }
        }
        if(answer2==0){
            flag=false;
        }
    }
    
    
    public int solution(String[] maps) {
        answer = 0;
        
        row=maps.length;
        col=maps[0].length();
        map=new char[row][col];
        
        for(int i=0;i<row;i++){
            map[i]=maps[i].toCharArray();
            for(int j=0;j<col;j++){
                if(map[i][j]=='S'){
                    sx=i;
                    sy=j;
                }
            }
        }
        
        visit=new boolean[row][col];
        BFS(sx,sy);
        q.clear();
        
        visit=new boolean[row][col];
        BFS2(lx,ly);
        
        answer+=answer2;
        
        if(!flag)
            answer=-1;
        
        return answer;
    }
}