
import java.io.*;
import java.util.*;


public class Main {
    int n,answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    Stack<Integer> stk = new Stack<>();

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            else{
                stk.push(num);
            }
        }
        for(int x:stk){
            answer+=x;
        }
        System.out.println(answer);
    }



    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}