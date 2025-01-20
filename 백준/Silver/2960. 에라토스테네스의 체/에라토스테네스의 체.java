
import java.util.*;
import java.io.*;

public class Main {

    int n,k,cnt,answer;
    boolean[] isPrime;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        isPrime=new boolean[n+1];

        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }

        for(int i=2;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                if(isPrime[j]){
                    isPrime[j]=false;
                    cnt++;
                    if(cnt==k){
                        System.out.println(j);
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}