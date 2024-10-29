class Solution {
    boolean func(int n,int num){
        int sum=0;
        for(int i=num;i<=n;i++){
            sum+=i;
            if(sum==n){
                return true;
            }
            if(sum>n){
                return false;
            }
        }
        return false;
    }
    public int solution(int n) {
        int answer = 0;
        int num=1;
        for(int i=num;i<=n;i++){
            if(func(n,i)){
                answer++;
            }
        }
        return answer;
    }
}