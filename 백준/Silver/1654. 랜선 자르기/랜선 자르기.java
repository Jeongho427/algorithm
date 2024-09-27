
import javax.lang.model.type.ArrayType;
import java.io.*;
import java.util.*;


public class Main {
    int k,n,max;
    long answer;
    int[] lans;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        lans=new int[k];
        for(int i=0;i<k;i++){
            lans[i] = Integer.parseInt(br.readLine());
            max=Math.max(max,lans[i]);
        }
        long lt=1;
        long rt=max;
        while(lt<=rt){
            long mid=(lt+rt)/2;
            long cnt=0;
            for(int i=0;i<k;i++){
                cnt+=lans[i]/mid;
            }
            if(cnt<n){
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