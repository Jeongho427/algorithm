
import java.util.*;
import java.io.*;

public class Main {

    int n,k,answer;
    List<Integer> arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception{
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(Integer.parseInt(br.readLine()));
        }

        arr.sort(Collections.reverseOrder());

        for(int a:arr){
            if((k/a)!=0){
                answer+=k/a;
                k%=a;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}