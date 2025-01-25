
import java.util.*;
import java.io.*;

public class Main {

    int n,max=0,sum=0;
    double answer;
    int[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i];
            max=Math.max(max,arr[i]);
        }
        answer=(double)sum/max*100/n;

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}