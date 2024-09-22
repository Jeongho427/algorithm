
import java.io.*;
import java.util.*;


public class Main {
    int n;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    Stack<Integer> stk = new Stack<>();
    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());

            switch(cmd){
                case 1:
                    int num = Integer.parseInt(st.nextToken());
                    stk.push(num);
                    break;
                case 2:
                    if(!stk.isEmpty())
                        System.out.println(stk.pop());
                    else
                        System.out.println(-1);
                    break;
                case 3:
                    System.out.println(stk.size());
                    break;
                case 4:
                    if(stk.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case 5:
                    if(!stk.isEmpty())
                        System.out.println(stk.peek());
                    else
                        System.out.println(-1);
                    break;
            }
        }
    }



    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}