import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {    
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i=0;i<participant.length;i++){
            hm.put(participant[i],hm.getOrDefault(participant[i],0)+1);
        }
        for(String s:completion){
            if(hm.containsKey(s)){
                hm.replace(s,hm.get(s)-1);
                if(hm.get(s)==0)
                    hm.remove(s);
            }
        }
        for(String s:hm.keySet()){
            answer=s;
        }
        
        return answer;
    }
}