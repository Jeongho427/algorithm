
import java.io.*;
import java.util.*;


public class Main {
    int n;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    Deque<Integer> q = new ArrayDeque<>();

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            String cmd=st.nextToken();
            switch(cmd){
                case "push":
                    int num=Integer.parseInt(st.nextToken());
                    q.offer(num);
                    break;
                case "pop":
                    if(q.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if(q.isEmpty())
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                case "front":
                    if(q.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(q.peek()).append("\n");
                    break;
                case "back":
                    if(q.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(q.getLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}