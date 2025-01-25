
import java.util.*;
import java.io.*;

public class Main {

    int n,answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n=Integer.parseInt(br.readLine());
        String s=br.readLine();
        for(int i=0;i<n;i++){
            answer+=s.charAt(i)-'0';
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}