class Solution {
    public int[] solution(int n, int s) {
        
        if(n>s)
            return new int[]{-1};
        
        int[] answer = new int[n];
        
        int base = s/n;
        int mod = s%n;
        
        for(int i=0;i<n;i++){
            answer[i] = base;
        }
        
        for(int i=n-1;i>=n-mod;i--){
            answer[i] += 1;
        }
        
        return answer;
    }
}