
import java.io.*;
import java.util.*;

public class Main {
    int n,answer = Integer.MIN_VALUE;
    int[] maxW;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        maxW = new int[n];

        for(int i=0;i<n;i++){
            maxW[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(maxW);

        for(int i=0;i<n;i++){
            answer = Math.max(answer, maxW[i]*(n-i));
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
