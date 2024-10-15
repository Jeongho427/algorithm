import java.util.*;

class Solution {
    int cnt;
    int size;
    
    void DFS(int L,int sum,int[] numbers,int target){
        if(L==size){
            if(sum==target){
                cnt++;
            }
        }
        else{
            DFS(L+1,sum+numbers[L],numbers,target);
            DFS(L+1,sum-numbers[L],numbers,target);
        }
    }
        
    public int solution(int[] numbers, int target) {
        int answer = 0;
        size=numbers.length;
        
        DFS(0,0,numbers,target);
        
        answer=cnt;
        
        return answer;
    }
}