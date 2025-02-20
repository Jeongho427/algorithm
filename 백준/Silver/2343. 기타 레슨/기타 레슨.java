
import java.util.*;
import java.io.*;


public class Main {

    int n,m,min=Integer.MAX_VALUE,sum=0,answer=Integer.MAX_VALUE;
    int[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int count(int size){
        int cnt = 1;
        int sum = 0;
        for(int a:arr){
            if(sum+a>size){
                cnt++;
                sum = a;
            }
            else{
                sum += a;
            }
        }

        return cnt;
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(mid)<=m){
                answer = mid;
                rt = mid - 1;
            }
            else{
                lt = mid + 1;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}