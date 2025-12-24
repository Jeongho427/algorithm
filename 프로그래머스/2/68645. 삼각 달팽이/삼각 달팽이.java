import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        int[][] arr = new int[n][n];
        List<Integer> answer = new ArrayList<>();
        
        int x = 0;
        int y = 0;
        
        int num = 1;
        int nxt = 0;
        while(true){
            int a,b;
            
            if(x<0||x>=n||y<0||y>=n||arr[x][y]!=0){
                break;
            }
            arr[x][y] = num++;
            
            if(nxt==0){
                a = x + 1;
                b = y;
            }
            else if(nxt==1){
                a = x;
                b = y + 1;
            }
            else{
                a = x - 1;
                b = y - 1;
            }
            
            if(a<0||a>=n||b<0||b>=n||arr[a][b]!=0){
                nxt = (nxt+1) % 3;
            }
            
            if(nxt==0){
                a = x + 1;
                b = y;
            }
            else if(nxt==1){
                a = x;
                b = y + 1;
            }
            else{
                a = x - 1;
                b = y - 1;
            }
            x = a;
            y = b;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                answer.add(arr[i][j]);
            }
        }
        
        return answer;
    }
}