
import java.io.*;
import java.util.*;



public class Main {
    int n,distSum;
    long curCost,answer;
    int[] dist;
    long[] oil;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        dist = new int[n-1];
        oil = new long[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n-1;i++){
            dist[i] = Integer.parseInt(st.nextToken());
            distSum += dist[i];
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            oil[i] = Integer.parseInt(st.nextToken());
        }

        answer += oil[0]*dist[0];
        distSum -= 2;
        curCost = oil[0];
        for(int i=1;i<n-1;i++){
            if(curCost*distSum>oil[i]*distSum){
                curCost = oil[i];
            }
            answer += curCost * dist[i];
            distSum -= dist[i];
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
