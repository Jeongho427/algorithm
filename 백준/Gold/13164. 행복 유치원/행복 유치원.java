
import java.io.*;
import java.util.*;


public class Main {
    int n,k,answer;
    int[] arr;
    Integer[] cha;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        cha = new Integer[n-1];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());

            if(i>0){
                cha[i-1] = arr[i] - arr[i-1];
            }
        }

        Arrays.sort(cha,Collections.reverseOrder());

        int idx = 0;
        while(k>1){
            cha[idx++] = 0;
            k--;
        }

        for(int c:cha){
            answer += c;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
