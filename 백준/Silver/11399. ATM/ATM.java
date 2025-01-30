
import java.util.*;
import java.io.*;


public class Main {

    int n,answer;
    int[] arr;
    int[] sum;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n=Integer.parseInt(br.readLine());
        arr=new int[n+1];
        sum=new int[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);


        for(int i=1;i<=n;i++){
            sum[i]=sum[i-1]+arr[i];
            answer+=sum[i];
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}