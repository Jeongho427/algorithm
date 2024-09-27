
import java.io.*;
import java.util.*;


public class Main {
    int n,m,max;
    long answer;
    int[] trees;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        trees=new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            trees[i] = Integer.parseInt(st.nextToken());
            max=Math.max(max,trees[i]);
        }
        long lt=1;
        long rt=max;
        while(lt<=rt){
            long mid=(lt+rt)/2;
            long sum=0;
            for(int i=0;i<n;i++){
                long res=trees[i]-mid;
                if(res>=0)
                    sum+=res;
            }
            if(sum<m){
                rt=mid-1;
            }
            else{
                answer=Math.max(answer,mid);
                lt=mid+1;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}