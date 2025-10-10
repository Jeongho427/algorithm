import java.util.*;

class Solution {
    int len;
    int answer;
    boolean ch[];
    
    Set<Integer> set = new HashSet<>();
    
    boolean isPrime(int num){
        boolean flag = true;
        
        if(num==0||num==1){
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                flag = false;
                break;
            }
        }
        
        return flag;
    }
    
    void dfs(int L,String str,String numbers){
        if(str.length()>0&&isPrime(Integer.parseInt(str))){
            set.add(Integer.parseInt(str));
        }
        
        if(L==len){
            return;
        }
        
        for(int i=0;i<len;i++){
            if(!ch[i]){
                ch[i] = true;
                dfs(L+1,str+numbers.charAt(i),numbers);
                ch[i] = false;
            }
        }
    }
    
    public int solution(String numbers) {
        answer = 0;
        
        len = numbers.length();
        ch = new boolean[len];
        
        dfs(0,"",numbers);
        
        answer = set.size();
        
        return answer;
    }
}