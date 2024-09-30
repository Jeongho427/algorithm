
import java.io.*;
import java.util.*;

class Point{
    int x,y;

    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

class Main {
    int n,answer;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    Deque<Integer> dq = new ArrayDeque<>();

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        dq.offerFirst(n);
        n--;
        while(n>0){
            dq.offerFirst(n);
            for(int i=0;i<n;i++){
                int tmp=dq.pollLast();
                dq.offerFirst(tmp);
            }
            n--;
        }
        for(int x:dq){
            System.out.print(x+" ");
        }
    }


    public static void main(String[] args) throws Exception{
        new Main().solution();
    }

}