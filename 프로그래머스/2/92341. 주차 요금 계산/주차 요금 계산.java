import java.util.*;

class Solution {
    
    StringTokenizer st;
    
    int toMinute(String time){
        String[] s = time.split(":");
        int res = Integer.parseInt(s[0])*60+Integer.parseInt(s[1]);
        return res;
    }
    
    int calc(int used,int[] fee){
        int basicTime = fee[0], basicFee = fee[1], unitTime = fee[2], unitFee = fee[3];
        if (used <= basicTime){
            return basicFee;
        }
        int extra = used - basicTime;
        int units = (extra + unitTime - 1) / unitTime;
        return basicFee + units * unitFee;
    }
    
    public int[] solution(int[] fees, String[] records) {
        
        Map<String,Integer> inTime = new HashMap<>();
        Map<String,Integer> total = new HashMap<>();
        Set<String> cars = new HashSet<>();
        
        for(String record:records){
            st = new StringTokenizer(record);
            int minute = toMinute(st.nextToken());
            String num = st.nextToken();
            String cmd = st.nextToken();
            cars.add(num);
            
            if(cmd.equals("IN")){
                inTime.put(num,minute);
            }
            else{
                int in = inTime.remove(num);
                total.put(num,total.getOrDefault(num,0)+(minute-in));
            }
        }
        
        int end = toMinute("23:59");
        for(String key:inTime.keySet()){
            int in = inTime.get(key);
            total.put(key,total.getOrDefault(key,0)+(end-in));
        }
            
        List<String> sorted = new ArrayList<>(cars);
        Collections.sort(sorted);
            
        int[] answer = new int[sorted.size()];
        for(int i=0;i<sorted.size();i++){
            int used = total.getOrDefault(sorted.get(i),0);
            answer[i] = calc(used,fees);
        }
        
        return answer;
    }
}