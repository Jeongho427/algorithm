import java.util.*;

class Tangerine implements Comparable<Tangerine>{
    int size,count;
    
    Tangerine(int size,int count){
        this.size=size;
        this.count=count;
    }
    
    @Override
    public int compareTo(Tangerine t){
        return t.count-this.count;
    }
}

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int t:tangerine){
            hm.put(t,hm.getOrDefault(t,0)+1);
        }
        
        List<Tangerine> tangerines=new ArrayList<>();
        for(int t:hm.keySet()){
            tangerines.add(new Tangerine(t,hm.get(t)));
        }
        Collections.sort(tangerines);
        
        int cnt=0;
        for(Tangerine t:tangerines){
            cnt+=t.count;
            answer++;
            if(cnt>=k){
                break;
            }
        }
        
        return answer;
    }
}