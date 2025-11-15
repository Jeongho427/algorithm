
import java.io.*;
import java.util.*;

class Pair implements Comparable<Pair>{
    int idx,value;

    Pair(int idx,int value){
        this.idx = idx;
        this.value = value;
    }

    @Override
    public int compareTo(Pair p){
        return this.idx - p.idx;
    }
}

public class Main {
    int n,answer;
    Pair[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());

        long total = 0;
        long prev = 0;
        arr = new Pair[n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int amount = Integer.parseInt(st.nextToken());

            arr[i] = new Pair(idx,amount);
            total += amount;
        }

        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            prev += arr[i].value;
            if(prev>=(total+1)/2){
                answer = arr[i].idx;
                break;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
