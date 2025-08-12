
import java.io.*;
import java.util.*;



public class Main {
    int n;
    double answer;
    Integer[] drinks;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        drinks = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            drinks[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(drinks,Comparator.reverseOrder());

        answer += drinks[0];

        for(int i=1;i<n;i++){
            answer += (double)drinks[i]/2;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
