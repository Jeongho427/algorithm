import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        
        int n=nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        answer=Math.min(n/2,hs.size());
        
        return answer;
    }
}