
import java.io.*;
import java.util.*;

public class Main {

    int n,answer=Integer.MAX_VALUE;
    int[][] board;
    boolean[] visit;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void count(){
        int ts=0,tl=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(visit[i]&&visit[j]){
                    ts+=board[i][j];
                }
                else if(!visit[i]&&!visit[j]){
                    tl+=board[i][j];
                }
            }
        }

        answer=Math.min(answer,Math.abs(ts-tl));
    }

    void combi(int L,int s){
        if(L==n/2){
            count();
            return;
        }
        for(int i=s;i<=n;i++){
            visit[i]=true;
            combi(L+1,i+1);
            visit[i]=false;
        }
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        board=new int[n+1][n+1];
        visit=new boolean[n+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=n;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        combi(0,1);

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}