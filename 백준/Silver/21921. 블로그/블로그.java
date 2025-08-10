
import java.io.*;
import java.util.*;



public class Main {
    int n,x;
    int[] arr;
    int[] sum;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        arr = new int[n];
        sum = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for(int i=0;i<x;i++){
            sum += arr[i];
        }

        int max = sum;
        int cnt = 1;
        for(int i=x;i<n;i++){
            sum += arr[i] - arr[i-x];
            if(max==sum){
                cnt++;
            }
            else if(max<sum){
                max = sum;
                cnt = 1;
            }
        }

        if(sum==0){
            System.out.println("SAD");
            return;
        }

        System.out.println(max);
        System.out.println(cnt);

    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
