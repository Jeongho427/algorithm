import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> hs=new HashSet<>();
        int num=1;
        int turn=1;
        String prev="";
        
        for(String word:words){
            //몇번이 말하는지, 몇번째 차례인지 계산
            turn=(num-1)/n+1;
            //종료 조건: 1. 중복된 단어, 끝말이 안이어졌을 때
            if(hs.contains(word)||(!prev.isEmpty()&&prev.charAt(prev.length()-1)!=word.charAt(0))){
                num=num%n;
                if(num==0){
                    num=n;
                }
                answer[0]=num;
                answer[1]=turn;
                return answer;
            }
            else{
                hs.add(word);
            }
            prev=word;
            num++;
        }
        answer[0]=0;
        answer[1]=0;

        return answer;
    }
}