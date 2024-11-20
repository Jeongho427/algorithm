
import java.io.*;
import java.util.*;


public class Main {
    int n,x,answer;
    int[] a;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        x = Integer.parseInt(br.readLine());

        Arrays.sort(a);

        int lt=0,rt=n-1;
        while(lt<rt){
            if(a[lt]+a[rt]>x){
                rt--;
            }
            else if(a[lt]+a[rt]==x){
                answer++;
                lt++;
                rt--;
            }
            else{
                lt++;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}