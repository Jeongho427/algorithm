
import java.util.*;
import java.io.*;


public class Main {

    int n,k;
    int[] A;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        k=Integer.parseInt(st.nextToken());
        A=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);


        System.out.println(A[k-1]);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}