
import java.util.*;
import java.io.*;

public class Main {

    int n,m;
    int[] arr;
    int[] sum;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[n+1];
        sum=new int[n+1];
        st=new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum[i]=sum[i-1]+arr[i];
        }
        for(int t=0;t<m;t++){
            st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            int answer=sum[j]-sum[i-1];
            System.out.println(answer);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}