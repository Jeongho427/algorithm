
import java.io.*;
import java.util.*;

class Lecture implements Comparable<Lecture> {
    int s, t;

    public Lecture(int s, int t) {
        this.s = s;
        this.t = t;
    }

    public int compareTo(Lecture l){
        return this.s-l.s;
    }
}

public class Main {

    int n,answer;
    int[] s;
    int[] t;

    List<Lecture> lectures = new ArrayList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    PriorityQueue<Integer> pq = new PriorityQueue<>();

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            lectures.add(new Lecture(s,t));
        }

        Collections.sort(lectures);

        pq.offer(lectures.get(0).t);

        for(int i=1;i<lectures.size();i++){
            if(pq.peek()<=lectures.get(i).s){
                pq.poll();
            }
            pq.offer(lectures.get(i).t);
        }

        answer = pq.size();

        System.out.println(answer);
    }



    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}