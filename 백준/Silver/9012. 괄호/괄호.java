
import java.io.*;
import java.util.*;


public class Main {
    int n,answer;
    String input;
    boolean flag;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    Stack<Character> stk = new Stack<>();

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            input = br.readLine();
            flag=true;
            int size=input.length();
            for(int j=0;j<size;j++){
                if(input.charAt(j)=='('){
                    stk.push('(');
                }
                else{
                    if(!stk.isEmpty()){
                        stk.pop();
                    }
                    else{
                        flag=false;
                    }
                }
            }
            if(stk.isEmpty()&&flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            stk.clear();
        }
    }



    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}