import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int aCnt = 0;
        int bCnt = 0;
        int cCnt = 0;
        
        int idx = 0;
        for(int ans:answers){
            if(ans==a[idx%a.length]){
                aCnt++;
            }
            if(ans==b[idx%b.length]){
                bCnt++;
            }
            if(ans==c[idx%c.length]){
                cCnt++;
            }
            idx++;
        }
        
        int max = Math.max(Math.max(aCnt,bCnt),cCnt);
        
        if(aCnt==max){
            answer.add(1);
        }
        if(bCnt==max){
            answer.add(2);
        }
        if(cCnt==max){
            answer.add(3);
        }
        
        return answer;
    }
}