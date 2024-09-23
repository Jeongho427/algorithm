
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
        while(true){
            input=br.readLine();
            flag=true;
            int len=input.length();

            if(len==1&&input.charAt(0)=='.'){
                break;
            }

            for(int i=0;i<len;i++){
                char c=input.charAt(i);
                if(c=='('||c=='[')
                    stk.push(c);
                else if(c==')'){
                    if(!stk.isEmpty()&&stk.peek()=='(') {
                        stk.pop();
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
                else if(c==']'){
                    if(!stk.isEmpty()&&stk.peek()=='[') {
                        stk.pop();
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
            }
            if(stk.isEmpty()&&flag)
                System.out.println("yes");
            else
                System.out.println("no");
            stk.clear();
        }
    }



    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}