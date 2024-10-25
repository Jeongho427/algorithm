import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer=0;
        int[] clothes=new int[n+1];
        
        for(int i=1;i<=n;i++){
            clothes[i]=1;
        }
        for(int l:lost){
            clothes[l]-=1;
        }
        for(int r:reserve){
            clothes[r]+=1;
        }
        for(int i=1;i<=n;i++){
            if(clothes[i]==0){
                if((i-1)!=0&&clothes[i-1]>1){
                    clothes[i-1]--;
                    clothes[i]++;
                }
                else if((i+1)!=(n+1)&&clothes[i+1]>1){
                    clothes[i+1]--;
                    clothes[i]++;
                }
            }
        }
        for(int c:clothes){
            if(c>0)
                answer++;
        }
        
        return answer;
    }
}