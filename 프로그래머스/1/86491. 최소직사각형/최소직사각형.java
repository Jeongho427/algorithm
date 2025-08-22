import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxRow = 0;
        int maxCol = 0;
        
        for(int[] s:sizes){
            maxRow = Math.max(maxRow, Math.max(s[0],s[1]));
            maxCol = Math.max(maxCol, Math.min(s[0],s[1]));
        }
        
        answer = maxRow*maxCol;
        
        return answer;
    }
}