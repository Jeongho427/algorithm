
import java.util.*;
import java.io.*;


public class Main {

    int n,num,recent=1;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    Stack<Integer> stk = new Stack<>();

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=n;i++){
            num = Integer.parseInt(br.readLine());
            while(recent<=num){
                stk.push(recent++);
                sb.append("+").append("\n");
            }
            if(num == stk.peek()){
                stk.pop();
                sb.append("-").append("\n");
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }



    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}