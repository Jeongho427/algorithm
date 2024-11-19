import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<elements.length;i++){
            int sum=0;
            for(int j=0;j<elements.length;j++){
                sum+=elements[(i+j)%elements.length];
                hs.add(sum);
            }
        }
        answer=hs.size();
        
        return answer;
    }
}