import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxCol = 0;
        int maxRow = 0;
        
        for(int[] s:sizes){
            maxCol = Math.max(maxCol,Math.max(s[0],s[1]));
            maxRow = Math.max(maxRow,Math.min(s[0],s[1]));
        }
        answer = maxCol*maxRow;
        
        return answer;
    }
}