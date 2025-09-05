import java.util.*;

class Solution {
    
    public String solution(String number, int k) {
        String answer = "";
        int remove = k;
        
        Stack<Character> stk = new Stack<>();
        
        for(int i=0;i<number.length();i++){
            char c = number.charAt(i);
            
            while(!stk.isEmpty()&&remove>0&&c>stk.peek()){
                stk.pop();
                remove--;
            }
            stk.push(number.charAt(i));
        }
        
        while(remove>0){
            stk.pop();
            remove--;
        }
        
        for(char s:stk){
            answer+=String.valueOf(s);
        }
        
        return answer;
    }
}