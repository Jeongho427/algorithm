
import java.io.*;
import java.util.*;



public class Main {
    int n,answer;
    Integer[] c;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        c = new Integer[n];

        for(int i=0;i<n;i++){
            c[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(c, Comparator.reverseOrder());

        for(int i=0;i<n;i++){
            if(i%3!=2){
                answer += c[i];
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
