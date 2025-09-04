
import java.io.*;
import java.util.*;


class Pair implements Comparable<Pair>{
    int start,end;

    Pair(int start,int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Pair p){
        if(this.end==p.end){
            return this.start-p.start;
        }

        return this.end - p.end;
    }
}

public class Main {
    int n,answer;
    List<Pair> meetings = new ArrayList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            Pair p = new Pair(a,b);
            meetings.add(p);
        }

        Collections.sort(meetings);

        int curEnd = 0;
        for(Pair m:meetings){
            if(m.start>=curEnd){
                answer++;
                curEnd = m.end;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
