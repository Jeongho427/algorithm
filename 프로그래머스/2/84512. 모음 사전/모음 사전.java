import java.util.*;

class Solution {
    int answer;
    String[] words={"A","E","I","O","U"};
    List<String> dict=new ArrayList<>();
    
    void DFS(int L,String str){
        dict.add(str);
        
        if(L==5) return;
        
        for(int i=0;i<5;i++){
            DFS(L+1,str+words[i]);
        }
    }
    
    public int solution(String word) {
        String str="";
        
        DFS(0,str);
        
        int cnt=0;
        for(String s:dict){
            if(s.equals(word)){
                answer=cnt;
                break;
            }
            cnt++;
        }
        
        return answer;
    }
}