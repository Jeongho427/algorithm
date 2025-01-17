import java.io.*;
import java.util.*;

class Main{
    int n,m,answer;
    int[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution()throws Exception{
        n=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int lt=0,rt=n-1;
        int sum=0;
        
        while(lt<rt){
            sum=arr[lt]+arr[rt];
            if(sum<m){
                sum-=arr[lt++];
            }
            else{
                if(sum==m){
                    answer++;
                }
                sum-=arr[rt--];
            }
        }
        
        System.out.println(answer);
    }
    
    public static void main(String[] args)throws Exception{
        new Main().solution();
    }
}