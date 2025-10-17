import java.util.*;

class Solution {
    int n,answer;
    
    void dfs(int L,int start,int sum,int[] numbers,int target){
        if(L==n&&sum==target){
            answer++;
        }
        for(int i=start;i<n;i++){
            dfs(L+1,i+1,sum-numbers[i],numbers,target);
            dfs(L+1,i+1,sum+numbers[i],numbers,target);
        }
    }
    
    public int solution(int[] numbers, int target) {
        n = numbers.length;
        
        dfs(0,0,0,numbers,target);
        
        return answer;
    }
}