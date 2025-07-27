
import java.io.*;
import java.util.*;

public class Main {
    int n,k;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    Queue<Integer> q = new LinkedList<>();

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for(int i=0;i<n;i++){
            q.offer(i+1);
        }

        System.out.print("<");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<k-1;j++){
                int num = q.poll();
                q.offer(num);
            }
            System.out.print(q.poll()+", ");
        }
        System.out.println(q.poll()+">");
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
