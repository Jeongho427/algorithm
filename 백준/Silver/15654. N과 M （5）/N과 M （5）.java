
import java.io.*;
import java.util.*;



public class Main {
    int n,m;
    int[] arr;
    int[] answer;
    boolean[] ch;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    void dfs(int L){
        if(L==m){
            for(int a:answer){
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<n;i++){
            if(!ch[i]){
                ch[i] = true;
                answer[L] = arr[i];
                dfs(L+1);
                ch[i] = false;
            }
        }
    }

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        answer = new int[m];
        ch = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0);

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
