import java.util.*;

class Solution {
    int answer = Integer.MAX_VALUE;
    boolean[][] map;
    boolean[] visit;
    
    int BFS(int n,int v,int cnt){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v] = true;
        cnt++;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int num = q.poll();
                for(int j=1;j<=n;j++){
                    if(map[num][j]&&!visit[j]){
                        q.offer(j);
                        visit[j] = true;
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
    
    public int solution(int n, int[][] wires) {
        
        for(int i=0;i<wires.length;i++){
            map = new boolean[n+1][n+1];
            visit = new boolean[n+1];
            
            for(int j=0;j<wires.length;j++){
                if(i!=j){
                    int x = wires[j][0];
                    int y = wires[j][1];
                    map[x][y] = true;
                    map[y][x] = true;
                }
            }
            
            int cnt=0;
            for(int j=1;j<=n;j++){
                if(!visit[j]){
                    cnt = Math.abs(cnt-BFS(n,j,0));
                }
            }
            
            answer = Math.min(answer,cnt);
        }
        
        return answer;
    }
}