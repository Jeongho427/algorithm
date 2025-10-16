class Solution {
    int answer = 0;
    int x = 5;
    int y = 5;
    int[] dx = {-1,0,1,0};
    int[] dy = {0,-1,0,1};
    boolean[][][] visit = new boolean[11][11][4];
    
    void move(int idx){
        int a = x + dx[idx];
        int b = y + dy[idx];
        
        if(a>=0&&a<11&&b>=0&&b<11){
            if (!visit[b][a][idx]) {
                visit[b][a][idx] = true;
                visit[y][x][(idx+2)%4] = true;
                answer++;
            }
            x = a;
            y = b;
        }
    }
    
    public int solution(String dirs) {
        
        for(char c:dirs.toCharArray()){
            int cmd = -1;
            
            switch (c) {
                case 'L': cmd = 0; break; // L
                case 'U': cmd = 1; break; // U
                case 'R': cmd = 2; break; // R
                case 'D': cmd = 3; break; // D
            }

            
            move(cmd);
            
        }
        
        return answer;
    }
}