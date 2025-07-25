
import java.io.*;
import java.util.*;

public class Main {
    int n;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    StringBuilder sb = new StringBuilder();
    Stack<Integer> stk = new Stack<>();

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch(cmd){
                case "push":
                    stk.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(stk.isEmpty()){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(stk.pop()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stk.size()).append("\n");
                    break;
                case "empty":
                    if(stk.isEmpty()){
                        sb.append("1\n");
                    }
                    else{
                        sb.append("0\n");
                    }
                    break;
                case "top":
                    if(stk.isEmpty()){
                        sb.append("-1\n");
                    }
                    else{
                        sb.append(stk.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
