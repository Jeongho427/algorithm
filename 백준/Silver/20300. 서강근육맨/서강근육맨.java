
import java.io.*;
import java.util.*;



public class Main {
    int n;
    long answer = 0;
    long[] t;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        t = new long[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            t[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(t);

        if(n%2==0){
            for(int i=0;i<n/2;i++){
                answer = Math.max(answer,t[i]+t[n-1-i]);
            }
        }
        else{
            answer = t[n-1];
            for(int i=0;i<(n-1)/2;i++){
                answer = Math.max(answer,t[i]+t[n-2-i]);
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
