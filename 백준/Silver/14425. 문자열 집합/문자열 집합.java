
import java.io.*;
import java.util.*;


public class Main {
    int n,m,answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    HashSet<String> hs = new HashSet<>();

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            hs.add(br.readLine());
        }
        for(int i=0;i<m;i++){
            String str = br.readLine();
            if(hs.contains(str)) answer++;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}