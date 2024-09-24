
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
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        int i=1;
        sb.append("<");
        while(!q.isEmpty()){
            if(i%k==0){
                sb.append(q.poll());
                if(!q.isEmpty()){
                    sb.append(", ");
                }
            }
            else if(!q.isEmpty()) {
                int num=q.poll();
                q.offer(num);
            }
            i++;
        }
        sb.append(">");
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}