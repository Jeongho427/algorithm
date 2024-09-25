
import java.io.*;
import java.util.*;


public class Main {
    int n;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    Deque<Integer> dq = new ArrayDeque<>();

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int num;
            switch(cmd){
                case 1:
                    num = Integer.parseInt(st.nextToken());
                    dq.offerFirst(num);
                    break;
                case 2:
                    num = Integer.parseInt(st.nextToken());
                    dq.offerLast(num);
                    break;
                case 3:
                    if(dq.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(dq.pollFirst()).append("\n");
                    break;
                case 4:
                    if(dq.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(dq.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(dq.size()).append("\n");
                    break;
                case 6:
                    if(dq.isEmpty())
                        sb.append("1\n");
                    else
                        sb.append(("0\n"));
                    break;
                case 7:
                    if(dq.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(dq.peekFirst()).append("\n");
                    break;
                case 8:
                    if(dq.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(dq.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}