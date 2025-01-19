import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int size = s.length();
        
        for(int i=0;i<size;i++){
            Stack<Character> stk = new Stack<>();
            s=s.substring(1)+s.charAt(0);
            boolean flag = true;
            
            for(int j=0;j<size;j++){
                char c=s.charAt(j);
                if(c=='('||c=='{'||c=='['){
                    stk.push(c);
                }
                else{
                    if(!stk.isEmpty()){
                        if(c==')'&&stk.peek()=='('){
                            stk.pop();
                        }
                        else if(c=='}'&&stk.peek()=='{'){
                            stk.pop();
                        }
                        else if(c==']'&&stk.peek()=='['){
                            stk.pop();
                        }
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
            }
            if(stk.isEmpty()&&flag){
                answer++;
            }
        }
        
        return answer;
    }
}