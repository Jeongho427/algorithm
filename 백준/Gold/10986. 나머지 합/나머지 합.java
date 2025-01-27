
import java.util.*;
import java.io.*;

public class Main {

    int n,m;
    long answer;
    long[] sum,d;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        sum=new long[n];
        d=new long[m];
        st=new StringTokenizer(br.readLine());
        sum[0]=Integer.parseInt(st.nextToken());
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<n;i++){
            int r=(int)(sum[i]%m);
            if(r==0) answer++;
            d[r]++;
        }

        for(int i=0;i<m;i++){
            if(d[i]>1){
                answer=answer+(d[i]*(d[i]-1)/2);
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}