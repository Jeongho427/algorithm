
import java.io.*;
import java.util.*;



public class Main {
    int n,m;
    int[] arr;
    boolean[] ch;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void dfs(int L,int[] arr){
        if(L==m){
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        for(int i=1;i<=n;i++){
            if(!ch[i]){
                ch[i] = true;
                arr[L] = i;
                dfs(L+1,arr);
                ch[i] = false;
            }
        }
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        ch = new boolean[n+1];

        dfs(0,arr);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
