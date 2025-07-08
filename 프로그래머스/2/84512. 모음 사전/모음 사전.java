import java.util.*;

class Solution {
    
    String[] words = {"A","E","I","O","U"};
    
    List<String> dict = new ArrayList<>();
    
    void DFS(int L,String str){
        dict.add(str);
        
        if(L==5) return;
        
        for(int i=0;i<5;i++){
            DFS(L+1,str+words[i]);
        }
    }
    
    public int solution(String word) {
        int answer=0;
        
        String str = "";
        
        DFS(0,str);
        
        for(String s:dict){
            if(s.equals(word)){
                break;
            }
            answer++;
        }
        
        return answer;
    }
}