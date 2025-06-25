import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer=0;
        
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(String[] cloth:clothes){
            String type=cloth[1];
            hm.put(type,hm.getOrDefault(type,0)+1);
        }
        
        int combi=1;
        for(int v:hm.values()){
            combi*=(v+1);
        }
        
        answer=combi-1;
        
        return answer;
    }
}