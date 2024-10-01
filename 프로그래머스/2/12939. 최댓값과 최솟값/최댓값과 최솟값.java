import java.util.*;


class Solution {
    int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    StringTokenizer st;
    
    public String solution(String s) {
        String answer = "";
        st=new StringTokenizer(s);
        while(st.hasMoreTokens()){
            int num=Integer.parseInt(st.nextToken());
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        answer+=min;
        answer+=" ";
        answer+=max;
        
        return answer;
    }
}