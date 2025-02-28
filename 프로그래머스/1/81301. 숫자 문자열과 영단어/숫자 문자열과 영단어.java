import java.util.*;

class Solution {
    public int solution(String s) {
        String answer="";
        
        HashMap<String,String> hm = new HashMap<>();
        hm.put("zero","0");
        hm.put("one","1");
        hm.put("two","2");
        hm.put("three","3");
        hm.put("four","4");
        hm.put("five","5");
        hm.put("six","6");
        hm.put("seven","7");
        hm.put("eight","8");
        hm.put("nine","9");
        
        int idx=0;
        while(idx<s.length()){
            if(Character.isDigit(s.charAt(idx))){
                answer+=s.charAt(idx++);
                continue;
            }
            else{
                String num="";
                while(true){
                    if(hm.containsKey(num)){
                        answer+=hm.get(num);
                        break;
                    }
                    num+=s.charAt(idx++);
                }
            }
        }
        
        return Integer.parseInt(answer);
    }
}