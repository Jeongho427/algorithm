import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        int n = queue1.length;
        long sum = 0;
        long sum1 = 0;
        
        int[] arr = new int[n*2];
        
        for(int i=0;i<n;i++){
            arr[i] = queue1[i];
            arr[n+i] = queue2[i];
            sum1 += arr[i];
            sum += (arr[i] + arr[n+i]);
        }
        
        if(sum%2==1){
            return -1;
        }
        
        int lt = 0;
        int rt = n;
        long half = sum/2;
        while(lt<rt){
            if(rt>=n*2)
                break;
            if(sum1>half){
                sum1-=arr[lt++];
                answer++;
            }
            else if(sum1<half){
                sum1+=arr[rt++];
                answer++;
            }
            else{
                break;
            }
        }
        
        if(answer!=0&&sum1!=half){
            answer = -1;
        }
        
        return answer;
    }
}