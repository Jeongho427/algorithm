import java.util.*;

class Point{
    int x,y;
    
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        int cnt = 1;
        boolean flag = false;
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        boolean[][] visit = new boolean[n][m];
        
        Queue<Point> q = new LinkedList<>();
        
        q.offer(new Point(0,0));
        visit[0][0] = true;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                Point p = q.poll();
                
                if(p.x==n-1&&p.y==m-1){
                    flag = true;
                    answer = cnt;
                    break;
                }
                
                for(int j=0;j<4;j++){
                    int a = p.x+dx[j];
                    int b = p.y+dy[j];
                    
                    if(a>=0&&a<n&&b>=0&&b<m){
                        if(maps[a][b]==1&&!visit[a][b]){
                            q.offer(new Point(a,b));
                            visit[a][b] = true;
                        }
                    }
                }
            }
            
            if(flag){
                break;
            }
            cnt++;
        }
        
        if(!flag){
            answer = -1;
        }
        
        return answer;
    }
}