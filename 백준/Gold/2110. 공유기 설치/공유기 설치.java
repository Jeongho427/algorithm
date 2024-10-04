
import java.io.*;
import java.util.*;


public class Main {
    int n,c,answer,min,max;
    int[] x;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int check(int dis){
        int prev=x[0],cnt=1;
        for(int i=1;i<n;i++){
            if(x[i]-prev>=dis){
                prev=x[i];
                cnt++;
            }
        }
        return cnt;
    }

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        x=new int[n];
        for(int i=0;i<n;i++){
            x[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(x);
        min=x[0];
        max=x[n-1];

        int lt=1,rt=max-min+1;
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(check(mid)<c){
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