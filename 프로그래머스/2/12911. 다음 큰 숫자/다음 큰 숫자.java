class Solution {
    public int solution(int n) {
        int answer = 0;
        int num=n;
        int countOne=0;
        String bn=Integer.toBinaryString(n);
        for(char c:bn.toCharArray()){
            if(c=='1'){
                countOne++;
            }
        }
        while(true){
            num++;
            int cnt=0;
            String bnum=Integer.toBinaryString(num);
            for(char c:bnum.toCharArray()){
                if(c=='1'){
                    cnt++;
                }
            }
            if(cnt==countOne){
                answer=num;
                break;
            }
        }
        return answer;
    }
}