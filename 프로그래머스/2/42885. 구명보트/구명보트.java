import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people); // 오름차순 정렬
        
        int left = 0; // 가장 가벼운 사람의 인덱스
        int right = people.length - 1; // 가장 무거운 사람의 인덱스

        // 투 포인터 방식으로 보트에 태움
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++; // 가장 가벼운 사람을 태움
            }
            right--; // 가장 무거운 사람을 태움
            answer++; // 보트 사용 횟수 증가
        }

        return answer;
    }
}
