
import java.io.*;
import java.math.BigInteger;
import java.util.*;



public class Main {
    int n,m;
    BigInteger[][] c;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        c = new BigInteger[101][101];

        for(int i=1;i<=100;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    c[i][j] = BigInteger.valueOf(1);
                }
                else{
                    c[i][j] = c[i-1][j-1].add(c[i-1][j]);
                }
            }
        }

        System.out.println(c[n][m]);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
