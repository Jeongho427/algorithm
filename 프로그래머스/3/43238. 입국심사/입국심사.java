import java.util.Arrays;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        
        long left = 1; // 최소 시간
        long right = (long) times[times.length - 1] * n; // 최악의 경우 (가장 오래 걸리는 심사관이 모든 사람을 심사할 경우)
        long answer = right;
        
        while (left <= right) {
            long mid = (left + right) / 2;
            long sum = 0; // mid 시간 동안 심사할 수 있는 총 사람 수
            
            for (int time : times) {
                sum += mid / time; // 각 심사관이 mid 시간 동안 심사할 수 있는 사람 수를 더함
            }
            
            if (sum >= n) {
                answer = mid;
                right = mid - 1; // 시간을 줄여서 더 최적의 답을 찾기 위해
            } else {
                left = mid + 1; // 심사할 수 있는 사람이 부족하므로 시간을 늘려야 함
            }
        }
        
        return answer;
    }
}
