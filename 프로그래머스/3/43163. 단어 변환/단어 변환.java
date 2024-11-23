import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int cnt=0;
        int[] check=new int[words.length];
        
        HashSet<String> hs=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        
        for(String s:words){
            hs.add(s);
        }
        
        q.offer(begin);
        
        while(!q.isEmpty()){
            int size=q.size();
            
            for(int i=0;i<size;i++){
                String word=q.poll();
                
                if(word.equals(target)){
                    answer=cnt;
                    break;
                }
                
                for(int j=0;j<words.length;j++){
                    int diff=0;
                    for(int k=0;k<word.length();k++){
                        if(word.charAt(k)!=words[j].charAt(k)){
                            diff++;
                        }
                    }
                    
                    if(diff==1&&check[j]==0){
                        q.offer(words[j]);
                        check[j]=1;
                    }
                }
            }
            cnt++;
        }
        
        return answer;
    }
}