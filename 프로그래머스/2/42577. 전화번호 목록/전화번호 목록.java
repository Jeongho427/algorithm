import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashSet<String> hs = new HashSet<>();
        for(String phone:phone_book){
            hs.add(phone);
        }
        
        for(String phone:phone_book){
            String s="";
            
            for(int i=0;i<phone.length()-1;i++){
                s+=phone.charAt(i);
                if(hs.contains(s)){
                    return false;
                }
            }    
        }
        
        
        return answer;
    }
}