import java.util.*;

class Solution {
    int L;
    int cnt;
    
    boolean[] visit;
    int[][] map;
    
    void DFS(int v){
        if(!visit[v]){
            cnt++;
            visit[v]=true;
        }
        
        if(v==L){
            return;
        }
        
        for(int i=0;i<=L;i++){
            if(map[v][i]==1&&!visit[i]){
                DFS(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        L=n;
        visit=new boolean[n+1];
        map=new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                map[i][j]=computers[i][j];
            }
        }
        
        for(int i=0;i<n;i++){
            cnt=0;
            DFS(i);
            if(cnt!=0){
                answer++;
            }
        }
        
        return answer;
    }
}