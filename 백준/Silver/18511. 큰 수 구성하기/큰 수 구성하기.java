
import java.io.*;
import java.util.*;

public class Main {
    int n,num,answer;
    int[] k;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void dfs(int current){
        if(current>n){
            return;
        }

        if(current>answer) {
            answer = current;
        }

        for(int i=0;i<num;i++){
            dfs(current * 10 + k[i]);
        }
    }

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        num = Integer.parseInt(st.nextToken());
        k = new int[num];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            k[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0);

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
