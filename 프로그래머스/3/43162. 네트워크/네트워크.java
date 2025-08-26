import java.util.*;

class Solution {
    int answer;
    int l;
    boolean[] visit;
    int[][] map;
    
    void dfs(int x){
        visit[x] = true;
        for(int i=0;i<l;i++){
            if(x!=i&&!visit[i]&&map[x][i]==1){
                visit[i] = true;
                dfs(i);
            }
        }
    }
    
    public int solution(int n, int[][] computers) {
        l = n;
        visit = new boolean[n];
        map = computers;
        
        for(int i=0;i<n;i++){
            if(!visit[i]){
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
}