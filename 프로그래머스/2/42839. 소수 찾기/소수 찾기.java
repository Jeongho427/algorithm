import java.util.*;

class Solution {
    
    HashSet<Integer> hs = new HashSet<>();
    
    boolean isPrime(int num){
        if(num==0||num==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    void combi(String str,String others){
        if(!str.equals("")){
            int number=Integer.valueOf(str);
            if(isPrime(number)){
                hs.add(number);
            }
        }
        
        for(int i=0;i<others.length();i++){
            combi(str+others.charAt(i),others.substring(0,i)+others.substring(i+1));
        }
    }
    
    public int solution(String numbers) {
        int answer = 0;
        
        combi("",numbers);
        
        answer=hs.size();
        
        return answer;
    }
}