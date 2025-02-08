
import java.io.*;
import java.util.*;


public class Main {

    int n;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    void DFS(int num,int len){
        if(len==n){
            System.out.println(num);
        }

        for(int i=1;i<10;i+=2){
            int nextNum = num * 10 + i;
            if(isPrime(nextNum)){
                DFS(nextNum, len + 1);
            }
        }
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());

        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}