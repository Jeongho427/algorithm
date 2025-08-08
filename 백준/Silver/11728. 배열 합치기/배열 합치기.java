
import java.io.*;
import java.util.*;



public class Main {
    int n,m;
    int[] a;
    int[] b;
    int[] answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n];
        b = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        int j = 0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                sb.append(a[i++]).append(" ");
            }
            else {
                sb.append(b[j++]).append(" ");
            }
        }

        while(i<n){
            sb.append(a[i++]).append(" ");
        }
        while(j<m){
            sb.append(b[j++]).append(" ");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
