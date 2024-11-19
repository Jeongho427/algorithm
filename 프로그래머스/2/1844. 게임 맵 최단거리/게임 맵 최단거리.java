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
    public int solution(int[][] maps) {
        int answer=0;
        int n=maps.length;
        int m=maps[0].length;
        boolean flag=false;
        
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};
    
        Queue<Point> q=new LinkedList<>();
        
        q.offer(new Point(0,0,1));
        maps[0][0]=0;
        
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Point p=q.poll();
                if(p.x==n-1&&p.y==m-1){
                    flag=true;
                    answer=p.cnt;
                    break;
                }
                for(int j=0;j<4;j++){
                    int a=p.x+dx[j];
                    int b=p.y+dy[j];
                    if(a>=0&&a<n&&b>=0&b<m&&maps[a][b]==1){
                        q.offer(new Point(a,b,p.cnt+1));
                        maps[a][b]=0;
                    }
                }
            }
        }
        if(!flag)
            answer=-1;
        
        return answer;
    }
}