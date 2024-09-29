
import java.io.*;
import java.util.*;


public class Main {
    int n,m;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    HashSet<Integer> hs = new HashSet<>();

    void solution() throws Exception{
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            hs.add(Integer.parseInt(st.nextToken()));
        }
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            int card = Integer.parseInt(st.nextToken());
            if(hs.contains(card))
                System.out.print(1+" ");
            else
                System.out.print(0+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}