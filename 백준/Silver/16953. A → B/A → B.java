
import java.io.*;
import java.util.*;



public class Main {
    int a,b,cnt;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        while(a<b){
            if(b%2==0){
                b/=2;
            }
            else if(b%10==1){
                b = (b-1)/10;
            }
            else{
                break;
            }
            cnt++;
        }

        if(a==b){
            System.out.println(cnt+1);
        }
        else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
