import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int bcnt=0;
        int zcnt=0;
        
        while(!s.equals("1")){
            int cnt=0;
            for(char c:s.toCharArray()){
                if(c=='1'){
                    cnt++;
                }
            }
            zcnt+=s.length()-cnt;
            s=Integer.toBinaryString(cnt);
            bcnt++;
        }
        answer[0]=bcnt;
        answer[1]=zcnt;
        
        return answer;
    }
}