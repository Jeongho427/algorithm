
import java.io.*;
import java.util.*;


public class Main {
    long n,s;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception {
        s = Long.parseLong(br.readLine());

        long lt = 1, rt = s;
        while(lt<=rt){
            long mid = (lt+rt)/2;
            long sum = mid*(mid+1)/2;
            if(sum>s){
                rt = mid -1;
            }
            else{
                lt = mid + 1;
                n = mid;
            }
        }

        System.out.println(n);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
