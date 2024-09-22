
import java.io.*;
import java.util.*;


public class Main {
    int n;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    Stack<Integer> stk = new Stack<>();
    Queue<Integer> line = new LinkedList<>();
    void solution() throws Exception{
        int num=1;
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            line.offer(Integer.parseInt(st.nextToken()));
        }
        while(!line.isEmpty()){
            if(line.peek()==num){
                line.poll();
                num++;
            }
            else{
                if(!stk.isEmpty()&&stk.peek()==num){
                    stk.pop();
                    num++;
                }
                else{
                    stk.push(line.poll());
                }
            }
        }
        while(!stk.isEmpty()){
            if(stk.peek()==num){
                stk.pop();
                num++;
            }
            else{
                System.out.println("Sad");
                System.exit(0);
            }
        }
        System.out.println("Nice");
    }



    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}