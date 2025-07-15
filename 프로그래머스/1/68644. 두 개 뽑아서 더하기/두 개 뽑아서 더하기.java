import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        
        Set<Integer> s = new HashSet<>();
        
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                s.add(numbers[i]+numbers[j]);
            }
        }
        
        List<Integer> lists = new ArrayList<>(s);
        Collections.sort(lists);
        
        int size = lists.size();
        answer = new int[size];
        
        for(int i=0;i<size;i++){
            answer[i] = lists.get(i);
        }
        
        return answer;
    }
}