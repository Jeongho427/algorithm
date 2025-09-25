class Solution {
    public int[] solution(int[] sequence, int k) {
        int start =- 1, end =- 1, lt = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        int[] answer = new int[2];
        
        for(int rt=0;rt<sequence.length;rt++){
            sum += sequence[rt];
            
            while(sum>k){
                sum -= sequence[lt++];
            }
            if(sum==k&&(rt-lt+1)<len){
                start = lt;
                end = rt;
                len = rt-lt+1;
            }
        }
        
        answer[0] = start;
        answer[1] = end;
        
        return answer;
    }
}