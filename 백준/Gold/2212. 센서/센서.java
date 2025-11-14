
import java.io.*;
import java.util.*;


public class Main {
    int n,k,answer;
    int[] sensor;
    Integer[] dist;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        if (k >= n) {
            System.out.println(0);
            return;
        }

        sensor = new int[n];
        dist = new Integer[n-1];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            sensor[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sensor);

        for(int i=0;i<n-1;i++){
            dist[i] = sensor[i+1] - sensor[i];
        }

        Arrays.sort(dist,Collections.reverseOrder());

        int idx = 0;
        while(k>1){
            dist[idx++] = 0;
            k--;
        }

        for(int d:dist){
            answer += d;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
