
import javax.lang.model.type.ArrayType;
import java.io.*;
import java.util.*;


public class Main {
    int n,m,c,num;
    int[] a;


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    Deque<Integer> dq = new ArrayDeque<>();

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        a=new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            if(a[i]==0){
                dq.offer(Integer.parseInt(st.nextToken()));
            }
            else{
                st.nextToken();
            }
        }
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            c = Integer.parseInt(st.nextToken());
            dq.offerFirst(c);
            num=dq.pollLast();
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}