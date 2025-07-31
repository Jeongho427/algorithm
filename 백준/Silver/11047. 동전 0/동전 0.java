
import java.io.*;
import java.util.*;

public class Main {
    int n,k,answer;
    Integer[] coins;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        coins = new Integer[n];

        for(int i=0;i<n;i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coins,Comparator.reverseOrder());

        for(int c:coins){
            if(k/c!=0){
                answer+=k/c;
                k%=c;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
