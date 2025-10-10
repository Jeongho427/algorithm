import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        List<Integer> answerList = new ArrayList<>();
        
        int[] cnt = new int[3];
        
        for(int i=0;i<answers.length;i++){
            if(answers[i]==a[i%a.length]){
                cnt[0]++;
            }
            if(answers[i]==b[i%b.length]){
                cnt[1]++;
            }
            if(answers[i]==c[i%c.length]){
                cnt[2]++;
            }
        }
        int max = Math.max(cnt[0],Math.max(cnt[1],cnt[2]));
        for(int i=0;i<3;i++){
            if(cnt[i]==max){
                answerList.add(i+1);
            }
        }
        
        return answerList;
    }
}