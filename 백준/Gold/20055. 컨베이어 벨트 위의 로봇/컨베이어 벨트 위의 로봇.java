
import java.io.*;
import java.util.*;


public class Main {
    int n,k,answer;
    int[] durability;
    boolean[] robotLoc;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    //컨베이어벨트 회전
    void rotate(){
        int tmp = durability[2*n];
        for(int i=2*n;i>=2;i--){
            durability[i] = durability[i-1];
        }
        durability[1] = tmp;

        for(int i=n;i>=2;i--){
            robotLoc[i] = robotLoc[i-1];
        }
        robotLoc[1] = false;
        robotLoc[n] = false;
    }

    //로봇 앞으로 움직임
    void forwardRobot(){
        for(int i=n-1;i>=1;i--){
            if(robotLoc[i]&&!robotLoc[i+1]&&durability[i+1]>0){
                robotLoc[i+1] = true;
                robotLoc[i] = false;
                durability[i+1]--;
            }
        }
        robotLoc[n] = false;
    }

    //로봇 올리기
    void putRobot(){
        if(durability[1]>0){
            robotLoc[1] = true;
            durability[1]--;
        }
    }

    //내구도가 0인 칸의 개수 확인
    boolean terminate(){
        int cnt = 0;
        for(int i=1;i<=2*n;i++){
            if(durability[i]==0){
                cnt++;
            }
        }

        if(cnt>=k){
            return true;
        }
        return false;
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        durability = new int[2*n+1];
        robotLoc = new boolean[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=2*n;i++){
            durability[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        while(true){
            cnt++;
            rotate(); //벨트와 로봇 회전
            forwardRobot(); //로봇 이동
            putRobot(); //로봇 올리기

            if(terminate()) { //종료조건 만족
                break;
            }
        }
        answer = cnt;

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
