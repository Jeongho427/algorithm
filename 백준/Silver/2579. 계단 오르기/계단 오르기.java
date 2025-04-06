
import java.io.*;


public class Main {

    int n,answer;
    int[] stairs = new int[301];
    int[] score = new int[301];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            stairs[i] = Integer.parseInt(br.readLine());
        }

        score[0] = stairs[0];
        score[1] = stairs[0]+ stairs[1];
        score[2] = Math.max(stairs[0]+stairs[2],stairs[1]+stairs[2]);

        for(int i=3;i<n;i++){
            score[i] = Math.max(score[i-2],score[i-3]+stairs[i-1])+stairs[i];
        }
        answer = score[n-1];

        System.out.println(answer);
    }



    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}