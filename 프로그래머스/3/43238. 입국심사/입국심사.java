import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        Arrays.sort(times);
        
        long lt = 1;
        long rt = (long)times[0]*n;
        
        while(lt<=rt){
            long mid = (lt+rt)/2;
            long sum = 0;
            
            for(int t:times){
                sum += mid/t;
            }
            
            if(sum>=n){
                answer = mid;
                rt = mid - 1;
            }
            else{
                lt = mid + 1;
            }
        }
        
        return answer;
    }
}
