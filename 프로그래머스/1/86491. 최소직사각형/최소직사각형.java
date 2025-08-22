import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxRow = 0;
        int maxCol = 0;
        
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            maxRow = Math.max(maxRow,sizes[i][0]);
            maxCol = Math.max(maxCol,sizes[i][1]);
        }
        
        answer = maxRow*maxCol;
        
        return answer;
    }
}