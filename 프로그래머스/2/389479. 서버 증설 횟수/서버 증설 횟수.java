import java.util.*;


class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int n = players.length;
        int[] servers = new int[n+k];
        
        for(int i=0;i<n;i++){
            if(players[i]/m>servers[i]){
                int cnt = players[i]/m - servers[i];
                answer += cnt;
                for(int j=0;j<k;j++){
                    servers[i+j] += cnt;
                }
            }
        }
        
        return answer;
    }
}