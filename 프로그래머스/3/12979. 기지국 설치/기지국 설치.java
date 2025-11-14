class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        
        int cover = 2 * w + 1;   // 기지국 하나가 커버하는 아파트 개수
        int idx = 0;             // stations 배열 인덱스
        int position = 1;        // 현재 검사 중인 아파트 번호 (1번부터 시작)

        while (position <= n) {
            // 1) 현재 position이 기존 기지국의 커버 범위 안에 있는 경우
            if (idx < stations.length && position >= stations[idx] - w && position <= stations[idx] + w) {
                // 이 기지국이 커버하는 오른쪽 끝 다음으로 점프
                position = stations[idx] + w + 1;
                idx++;
            } else {
                // 2) 기존 기지국이 커버하지 못하는 빈 구간인 경우 → 새 기지국 설치
                answer++;
                // 새 기지국을 position에 설치했다고 가정하면,
                // [position ~ position + cover - 1] 까지 커버하므로 그 다음으로 점프
                position += cover;
            }
        }
        
        return answer;
    }
}
