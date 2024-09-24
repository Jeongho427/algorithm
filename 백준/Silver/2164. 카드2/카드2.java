
import java.io.*;
import java.util.*;


public class Main {
    int n,answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Queue<Integer> q = new LinkedList<>();

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
        while(!q.isEmpty()){
            answer=q.poll();
            if(q.isEmpty())
                break;
            else
                q.offer(q.poll());
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}