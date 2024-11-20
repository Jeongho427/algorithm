
import java.io.*;
import java.util.*;


public class Main {
    int n,x,answer;
    int[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int lt=0,rt=n-1;
        int min=Integer.MAX_VALUE,lans=0,rans=0;

        while(lt<rt){
            int sum=arr[lt]+arr[rt];
            if(Math.abs(sum)<min){
                min=Math.abs(sum);
                lans=arr[lt];
                rans=arr[rt];
                if(sum==0)
                    break;
            }
            if(sum<0)
                lt++;
            else
                rt--;
        }

        System.out.println(lans+" "+rans);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}