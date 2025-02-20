import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> stk = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stk.push(s.charAt(i));
            }
            else{
                if(stk.isEmpty()){
                    return false;
                }
                else{
                    stk.pop();
                }
            }
        }
        
        if(stk.isEmpty()){
            answer=true;
        }
        
        return answer;
    }
}