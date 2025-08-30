import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int cnt = 0;
        boolean flag = false;
        boolean[] check = new boolean[words.length];
        
        Queue<String> q = new LinkedList<>();
        
        q.offer(begin);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                String word = q.poll();
                
                if(word.equals(target)){
                    flag= true;
                    answer = cnt;
                    break;
                }
                
                for(int j=0;j<words.length;j++){
                    int diff = 0;
                    
                    if(check[j]){
                        continue;
                    }
                    
                    for(int k=0;k<words[j].length();k++){
                        if(word.charAt(k)!=words[j].charAt(k)){
                            diff++;
                        }
                    }
                    
                    if(diff==1){
                        q.offer(words[j]);
                        check[j] = true;
                    }
                }
            }
            
            if(flag){
                break;
            }
            cnt++;
        }
        
        return answer;
    }
}