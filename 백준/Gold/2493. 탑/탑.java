
import java.io.*;
import java.util.*;



class Main {
    int n,answer;
    int[] arr;
    int[] topNum;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    Stack<Integer> stk = new Stack<>();

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        topNum = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<=n;i++){

            while(!stk.isEmpty()&&arr[stk.peek()]<arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                topNum[i]=0;
            }
            else{
                topNum[i]=stk.peek();
            }
            stk.push(i);
        }

        for(int i=1;i<=n;i++){
            System.out.print(topNum[i]+" ");
        }
    }



    public static void main(String[] args) throws Exception{
        new Main().solution();
    }

}